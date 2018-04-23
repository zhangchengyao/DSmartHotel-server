package application.service;

import application.vo.ChatFile;

import java.io.File;

/**
 * Created by zhouchang on 18/4/13.
 */
public interface InstMsgService {
    public boolean uploadChatHistory(ChatFile[] files);
    public ChatFile[] downloadCloudChatHistory();
}
