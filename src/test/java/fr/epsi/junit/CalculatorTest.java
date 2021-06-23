package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init() {
        //TODO

        this.calculator = new Calculator();
    }

    @Test
    public void should_add_two_numbers() {
        // TO TEST
        int a = 5;
        int b = 6;
        int result = a + b;
        Assertions.assertEquals(result, this.calculator.add(a, b));
        System.out.println("Addition terminée");
    }

    @Test
    public void should_substract_two_numbers() {
        // TO TEST
        int a = 16;
        int b = 8;
        int result = a - b;
        Assertions.assertEquals(result, this.calculator.substract(a, b));
        System.out.println("Soustraction terminée");
    }

    @Test
    public void should_multi_two_numbers() {
        // TO TEST
        int a = 10;
        int b = 2;
        int result = a * b;
        Assertions.assertEquals(result, this.calculator.multi(a, b));
        System.out.println("Multiplication terminée");
    }

    @Test
    public void should_divide_two_numbers() {
        // TO TEST
        int a = 40;
        int b = 10;
        int result = a / b;
        Assertions.assertEquals(result, this.calculator.div(a, b));
        System.out.println("Division terminée");
    }

    @Test
    public void calculate_table() {
        // TO TEST
        int[] tab = {1, 2, 3, 4, 5};
        int somme = 0;
        for (int i : tab) {
            somme = somme + i;
        }
        if (somme == 15) {
            System.out.println("Tableau OK");
        }
    }
}