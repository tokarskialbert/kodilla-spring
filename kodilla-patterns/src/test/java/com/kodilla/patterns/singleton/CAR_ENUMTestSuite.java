package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class CAR_ENUMTestSuite {

    @Test
    public void testSetPrice() {

        //given //when
        CAR_ENUM.getInstance().setPrice(100);

        CAR_ENUM car_enum = CAR_ENUM.getInstance();
        int price = car_enum.getPrice();

        //then
        Assert.assertTrue(price == 100);
    }
}
