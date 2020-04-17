package com.kodilla.spring.calculator;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        calculator.add(3, 4);
        calculator.sub(3, 4);
        calculator.div(10, 2);
        calculator.mul(10, 2);

        //Then
        //do nothing
    }
}
