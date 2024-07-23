package com.pd.strategy;

/**
 * 发送站内信服务
 */

public class WebMessageService implements ISendMessageStrategy{

    @Override
    public void sendMessage(String message) {
        System.out.println("正在发送站内信......");
        System.out.println("站内信内容：" + message);
    }
}
