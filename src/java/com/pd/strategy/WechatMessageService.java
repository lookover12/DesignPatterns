package com.pd.strategy;

/**
 * 微信公众号消息服务
 */

public class WechatMessageService implements ISendMessageStrategy{

    @Override
    public void sendMessage(String message) {
        System.out.println("正在发送微信公众号消息......");
        System.out.println("公众号消息：" + message);
    }
}
