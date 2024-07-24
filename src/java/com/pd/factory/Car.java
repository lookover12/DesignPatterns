package com.pd.factory;

/**
 * 汽车工厂
 */

public interface Car {

    /**
     * 汽车轮胎
     */
    public String tire();

    /**
     * 玻璃
     */
    public String glass();

    /**
     * 座椅
     */
    public String seat();

    /**
     * 组装
     */
    public String assembly(String... component);
}
