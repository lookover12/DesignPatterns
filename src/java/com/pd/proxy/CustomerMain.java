package com.pd.proxy;

public class CustomerMain {

    public static void main(String[] args) {
        //1.先找到链家看房子
        LianJia lianJia = new LianJia();
        lianJia.seeHouse("XXX号一单元");

        //2.再找我爱我家进行比较
        WoAiWoJia woAiWoJia = new WoAiWoJia();
        woAiWoJia.seeHouse("XXX号一单元");

        //3.通过比较决定通过链家购买
        lianJia.buyHouse("XXX号一单元", 100.0);
    }
}
