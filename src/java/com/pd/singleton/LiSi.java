package com.pd.singleton;

/**
 * 李四
 */

public class LiSi {

    private static LiSi liSi;

    private LiSi() {

    }

    public static LiSi getLiSi() {
        if(liSi == null) {
            synchronized (LiSi.class) {
                if (liSi == null) {
                    liSi = new LiSi();
                }
            }
        }
        return liSi;
    }

    public static String dealWork(String doSomeThing) {
        System.out.println("lisi的工号：" + liSi);
        System.out.println("lisi正在处理" + doSomeThing);
        return "lisi处理完了" + doSomeThing;
    }
}
