package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigMac() {

        //Given
        Bigmac bigmac = new Bigmac.Builder()
                .bun(Bun.SEZAM_BUN)
                .burger(2)
                .sauce(Sauce.KETCHUP)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.BACON)
                .ingredient(Ingredients.CUCUMBER)
                .ingredient(Ingredients.LETTUCE)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}

