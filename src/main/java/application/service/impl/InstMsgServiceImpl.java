package application.service.impl;

import application.service.InstMsgService;
import application.vo.ChatFile;
//import io.ipfs.api.IPFS;
//import io.ipfs.api.MerkleNode;
//import io.ipfs.api.NamedStreamable;
import io.ipfs.multihash.Multihash;
import org.jivesoftware.smack.util.FileUtils;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouchang on 18/4/13.
 */
@Service
public class InstMsgServiceImpl implements InstMsgService {
    private final String CHAT_FILE_DIR = "./chatFiles/";

    @Override
    public boolean uploadChatHistory(ChatFile[] files) {
        IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
//        try {
//            ipfs.refs.local();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }

        File dir = new File(CHAT_FILE_DIR);
        if(!dir.exists()){
            dir.mkdirs();//创建目录
        }

        List<NamedStreamable> namedStreamableFiles = new ArrayList<NamedStreamable>();
        List<MerkleNode> merkleNodes = null;
        for (int i = 0; i < files.length; i++) {
            File file = new File( CHAT_FILE_DIR, files[i].getFileName());
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
                //创建文件成功后，写入内容到文件里
                wirteFileContent(file, files[i].getFileContent());
            }

            NamedStreamable.FileWrapper namedStreamableFile = new NamedStreamable.FileWrapper(file);
            namedStreamableFiles.add(namedStreamableFile);
        }
        try {
            merkleNodes = ipfs.add(namedStreamableFiles, false);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        saveCloudChatFilesHashAndName(merkleNodes);

        try {
            org.apache.tomcat.util.http.fileupload.FileUtils.cleanDirectory(dir);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
//        NamedStreamable.ByteArrayWrapper file = new NamedStreamable.ByteArrayWrapper("hello.txt", "G'day world! IPFS rocks!".getBytes());
//        MerkleNode addResult = ipfs.add(file).get(0);
    }

    @Override
    public ChatFile[] downloadCloudChatHistory() {
        IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
        String[] hashAndNameStrings = getCloudChatFilesHashAndName();
        ChatFile[] chatFiles = new ChatFile[hashAndNameStrings.length];
        int cnt = 0;

        for (int i = 0; i < hashAndNameStrings.length; i++) {
            Multihash filePointer = Multihash.fromBase58(hashAndNameStrings[i]);
            byte[] fileContents = new byte[0];
            try {
                fileContents = ipfs.cat(filePointer);
            } catch (IOException e) {
                e.printStackTrace();
                return new ChatFile[0];
            }
            String fileContent = fileContents.toString();
            ChatFile chatFile = new ChatFile();
            chatFile.setFileContent(fileContent);
            chatFile.setFileName(hashAndNameStrings[i].split("/")[1]);
            chatFiles[cnt++] = chatFile;
        }

        return chatFiles;
    }

//    private String readFileName(String fileContent) {
//        int rear = fileContent.indexOf('\n');
//        return fileContent.substring(0, rear);
//    }
//
//    private String removeFileNameFromContent(String fileContent) {
//        int rear = fileContent.indexOf('\n');
//        return fileContent.substring(rear + 1);
//    }

    private String[] getCloudChatFilesHashAndName() {
        return null;
    }

    private String[] saveCloudChatFilesHashAndName(List<MerkleNode> merkleNodes) {
        return null;
    }

    private static boolean wirteFileContent(File file, String content) {
        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(content);
            pw.flush();
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }
}
