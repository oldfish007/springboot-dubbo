package com.oldfish.mooc.springbootdubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.oldfish.mooc.springbootdubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author
 * @description
 * @date 2019/5/13
 */
@Component
public class QuickstartConsumer {
    @Reference(interfaceClass = ServiceAPI.class)
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }
}
