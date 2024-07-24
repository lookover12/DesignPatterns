package com.pd.proxy;

/**
 * 房产中介(链家)
 */

public class LianJia implements Agent{

    //首先定义它是房产中介
    private Agent agent;

    public LianJia(){
        this.agent = new House();
    }

    @Override
    public String seeHouse(String house) {
        return this.agent.seeHouse(house);
    }

    @Override
    public void buyHouse(String house, double price) {
        this.agent.buyHouse(house, price);
    }
}
