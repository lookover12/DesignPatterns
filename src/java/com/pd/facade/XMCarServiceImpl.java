package com.pd.facade;

public class XMCarServiceImpl implements XMCarService {
    @Override
    public void buyComponent() {
        System.out.println("购买生产汽车的零件");
    }

    @Override
    public void productionCar() {
        System.out.println("生产汽车");
    }

    @Override
    public void testProduction() {
        System.out.println("汽车验收");
    }

    @Override
    public void sellComponent() {
        System.out.println("汽车售卖");
    }
}
