package com.dg.osgi.calculator.consumer;

import com.dg.osgi.calculator.provider.api.Calculator;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class CalculatorConsumer {

    @Reference
    private Calculator calculator;

    @Activate
    public void activate() {
        int a = 7;
        int b = 14;

        System.out.println(String.format("The multiplication of %d and %d is: %d", a, b, calculator.multiply(a, b)));
    }
}
