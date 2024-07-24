package com.pd.factory;

/**
 * 大卡车
 */

public class Truck implements Car{
    @Override
    public String tire() {
        System.out.println("大卡车的轮胎");
        return "大卡车轮胎";
    }

    @Override
    public String glass() {
        System.out.println("大卡车的挡风玻璃");
        return "大卡车挡风玻璃";
    }

    @Override
    public String seat() {
        System.out.println("大卡车座椅");
        return "大卡车座椅";
    }

    @Override
    public String assembly(String... component) {
        return "大卡车";
    }
}
