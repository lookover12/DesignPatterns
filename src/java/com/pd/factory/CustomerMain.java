package com.pd.factory;

/**
 * 顾客
 */

public class CustomerMain {

    public static void main(String[] args) {
        //1.顾客1想买一台大卡车
        System.out.println("顾客1买大卡车：" + CarFactory.creature(new Truck()));

        //2.顾客2想买一台suv
        System.out.println("顾客2买suv：" + CarFactory.creature(new Suv()));
    }
}
