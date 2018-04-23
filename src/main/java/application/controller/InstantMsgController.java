package application.controller;

import application.service.InstMsgService;
import application.service.impl.InstMsgServiceImpl;
import application.vo.ChatFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;

/**
 * Created by zhouchang on 18/4/13.
 */
@RestController
@RequestMapping("/instantMsg")
public class InstantMsgController {
    @Autowired
    private InstMsgService instMsgService;
    /**
     * 请求内容是一个json串,spring会自动把他和我们的参数bean对应起来,不过要加@RequestBody注解
     * @param files
     */
    @PostMapping(value="/uploadChatHistory")
    public boolean uploadChatHistory(@RequestBody ChatFile[] files) {
        return instMsgService.uploadChatHistory(files);
    }

    @GetMapping(value="/downloadCloudChatHistory")
    public ChatFile[] downloadCloudChatHistory() {
        return instMsgService.downloadCloudChatHistory();
    }

}
