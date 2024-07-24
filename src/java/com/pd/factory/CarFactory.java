package com.pd.factory;

/**
 * 汽车工厂
 */

public class CarFactory {

    public static String creature(Car car) {
        return car.assembly(car.tire(), car.glass(), car.seat());
    }
}
