package com.pd.strategy;

/**
 * 短信发送服务
 */

public class SMSService implements ISendMessageStrategy{

    @Override
    public void sendMessage(String message) {
        System.out.println("正在进行短信发送......");
        System.out.println("短信内容：" + message);
    }
}
