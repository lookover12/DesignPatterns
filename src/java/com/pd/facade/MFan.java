package com.pd.facade;

/**
 * 米粉购买小米su7
 */

public class MFan {

    public static void main(String[] args) {
        //去小米之家
        XmHome xmHome = new XmHome();

        System.out.println("米粉购买：" + xmHome.interactionCar("su7"));
    }
}
