package com.pd.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Context context;

        //我要发送邮件信息
        context = new Context(new EmailService());
        context.sendMessage("你好，明天上午10点开会，记得到场哟！");
        System.out.println("邮件发送完毕.......");

        //我要发送短信信息
        context = new Context(new SMSService());
        context.sendMessage("您的号码本月消费了101元，具体消费详情已发送您的邮箱");
        System.out.println("短信发送完毕.........");

        //我要发送站内信信息
        context = new Context(new WebMessageService());
        context.sendMessage("您总共消费101元");
        System.out.println("站内信发送完毕......");

        //我要发送微信公众号消息
        context = new Context(new WechatMessageService());
        context.sendMessage("大促销！！！！");
        System.out.println("微信公众号消息发送完毕.........");
    }
}
