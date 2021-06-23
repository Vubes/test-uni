package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    public void init(){
        //TODO
    }

    public void should_add_two_numbers(){
       // TO TEST
        int a = 5;
        int b = 6;
        int result = a + b;
        Assertions.assertEquals(result, this.calculator.add(a, b));
        System.out.println("Addition terminée");
    }

    public void should_substract_two_numbers(){
        // TO TEST
        int a = 16;
        int b = 8;
        int result = a - b;
        Assertions.assertEquals(result, this.calculator.substract(a, b));
        System.out.println("Soustraction terminée");
    }

    public void should_multi_two_numbers(){
        // TO TEST
        int a = 10;
        int b = 2;
        int result = a*b;
        Assertions.assertEquals(result, this.calculator.multi(a, b));
        System.out.println("Multiplication terminée");
    }

    public void should_divide_two_numbers(){
        // TO TEST
        int a = 40;
        int b = 10;
        int result = a/b;
        Assertions.assertEquals(result, this.calculator.div(a, b));
        System.out.println("Division terminée");
    }
}
