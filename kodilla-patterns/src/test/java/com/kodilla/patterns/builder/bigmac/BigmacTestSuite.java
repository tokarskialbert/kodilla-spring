package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigMac() {

        //Given
        Bigmac bigmac = new Bigmac.Builder()
                .bun(BUN.SEZAM_BUN)
                .burger(2)
                .sauce(SAUCE.KETCHUP)
                .ingredient(INGREDIENTS.CHEESE)
                .ingredient(INGREDIENTS.BACON)
                .ingredient(INGREDIENTS.CUCUMBER)
                .ingredient(INGREDIENTS.LETTUCE)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}

