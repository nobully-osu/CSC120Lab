package Module8.Lab827;

import java.util.Scanner;

// Lab 8.27
public class Calculator {
    // Build Calculator class with public methods and private fields listed above

    /* Type your code here. */
    private double value;

    public Calculator() {
        value = 0.0;
    }

    public double getValue() {
        return value;
    }

    public void add(double input) {
        value += input;
    }

    public void subtract(double input) {
        value -= input;
    }

    public void multiply(double input) {
        value *= input;
    }

    public void divide(double input) {
        value /= input;
    }

    public void clear() {
        value = 0.0;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner keyboard = new Scanner(System.in);
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();

        // 1. The initial value
        System.out.println(calc.getValue());

        // 2. The value after adding num1
        calc.add(num1);
        System.out.println(calc.getValue());

        // 3. The value after multiplying by 3
        calc.multiply(3);
        System.out.println(calc.getValue());

        // 4. The value after subtracting num2
        calc.subtract(num2);
        System.out.println(calc.getValue());

        // 5. The value after dividing by 2
        calc.divide(2);
        System.out.println(calc.getValue());

        // 6. The value after calling the clear() method
        calc.clear();
        System.out.println(calc.getValue());
    }
}

