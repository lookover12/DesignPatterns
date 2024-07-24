package com.pd.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 领导给张三排任务
 */

public class Leader {

    public static void main(String[] args) {
//        //叫张三去办公室
//        ZhangSan zhangSan = ZhangSan.getZhangSan();
//        System.out.println(zhangSan.dealWork("去给我倒杯茶"));

        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i++) {
            Runnable worker = new Worker();
            service.submit(worker);
        }
    }
}
