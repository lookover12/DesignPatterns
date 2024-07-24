package com.pd.facade;

/**
 * 小米之家(门面)
 */

public class XmHome {

    private XMCarService xmCarService = new XMCarServiceImpl();

    public String interactionCar(String m) {
        xmCarService.buyComponent();
        xmCarService.productionCar();
        xmCarService.testProduction();
        xmCarService.sellComponent();

        return "su7";
    }
}
