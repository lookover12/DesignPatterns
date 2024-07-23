package com.pd.strategy;

/**
 * 发送邮件的服务类
 */

public class EmailService implements ISendMessageStrategy {

    public void sendMessage(String message) {
        System.out.println("正在进行邮件的发送......");
        System.out.println("邮件内容：" + message);
    }
}
