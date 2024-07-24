package com.pd.proxy;

/**
 * 房产中介
 */

public interface Agent {

    public String seeHouse(String house);

    public void buyHouse(String house, double price);
}
