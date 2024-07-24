package com.pd.proxy;

/**
 * 房屋
 */

public class House implements Agent{


    @Override
    public String seeHouse(String house) {
        //根据传入的房屋地址或者编码查询出房屋信息
        System.out.println("正在查询房子[" + house + "]的信息.......");
        return "房子[" + house + "]，面积120平方，四室两厅两卫";
    }

    @Override
    public void buyHouse(String house, double price) {
        System.out.println("房子[" + house + "]正在以价格" + price + "价格进行交易");
        System.out.println("房子[" + house + "]交易成功......");
    }
}
