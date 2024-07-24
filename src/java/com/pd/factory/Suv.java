package com.pd.factory;

/**
 * suv车型
 */

public class Suv implements Car{

    @Override
    public String tire() {
        System.out.println("Suv的轮胎");
        return "Suv轮胎";
    }

    @Override
    public String glass() {
        System.out.println("Suv的挡风玻璃");
        return "Suv挡风玻璃";
    }

    @Override
    public String seat() {
        System.out.println("Suv座椅");
        return "Suv座椅";
    }

    @Override
    public String assembly(String... component) {
        return "Suv";
    }
}
