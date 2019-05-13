package com.oldfish.mooc.springbootdubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.oldfish.mooc.springbootdubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author
 * @description
 * @date 2019/5/13
 */
@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message="+message;
    }
}
