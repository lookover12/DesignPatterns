package com.pd.singleton;

public class Worker implements Runnable{
    @Override
    public void run() {
        ZhangSan zhangSan = ZhangSan.getZhangSan();
        System.out.println(zhangSan.dealWork("去给我倒杯茶" + Thread.currentThread()));

        LiSi liSi = LiSi.getLiSi();

        System.out.println(liSi.dealWork("打印文件") + Thread.currentThread());
    }
}
