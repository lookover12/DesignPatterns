package com.pd.proxy;

/**
 * 房产中介(我爱我家)
 */

public class WoAiWoJia implements Agent{

    //首先定义为中介
    private Agent agent;

    public WoAiWoJia(){
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
