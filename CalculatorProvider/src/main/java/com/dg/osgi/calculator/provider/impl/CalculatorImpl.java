package com.dg.osgi.calculator.provider.impl;

import com.dg.osgi.calculator.provider.api.Calculator;
import org.osgi.service.component.annotations.Component;

@Component
public class CalculatorImpl implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
