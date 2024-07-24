package com.pd.multition;

public class Staff {

    public String dealWork(String doSomeThing) {
        System.out.println("工号：" + this + "正在处理事情：" + doSomeThing);
        return "工号：" + this + "处理完成了" + doSomeThing;
    }
}
