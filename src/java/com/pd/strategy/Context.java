package com.pd.strategy;

/**
 * 发送短信调度策略
 */

public class Context {

    private ISendMessageStrategy strategy;

    public Context(ISendMessageStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendMessage(String message) {
        this.strategy.sendMessage(message);
    }
}
