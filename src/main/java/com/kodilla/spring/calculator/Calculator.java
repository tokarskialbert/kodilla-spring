package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {

        display.displayValue(a + b);
        return a + b;
    }

    double sub(double a, double b) {

        display.displayValue(a - b);
        return a - b;
    }

    double mul(double a, double b) {

        display.displayValue(a * b);
        return a * b;
    }

    double div(double a, double b) {

        if (b != 0) {

            display.displayValue(a / b);
            return a / b;
        } else {

            display.displayValue(0);
            return 0;
        }
    }
}
