package com.pd.singleton;

/**
 * 张三一个个体
 */

public class ZhangSan {

    private static ZhangSan zhangSan;

    private ZhangSan() {}

    public static ZhangSan getZhangSan() {
        if(zhangSan == null) {
            zhangSan = new ZhangSan();
        }

        return zhangSan;
    }

    public static String dealWork(String doSomeThing) {
        System.out.println("zhangsan的工号：" + zhangSan);
        System.out.println("zhangsan正在处理" + doSomeThing);
        return "zhangsan处理完了" + doSomeThing;
    }
}
