package com.pranav.streamAPI;

@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);
}
public class lambdaExpression {
    public static void main(String[] args) {

        // Define lambda expressions for different operations
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        // Test the operations
        System.out.println("Addition: " + operate(5, 3, addition));
        System.out.println("Subtraction: " + operate(5, 3, subtraction));
        System.out.println("Multiplication: " + operate(5, 3, multiplication));
        System.out.println("Division: " + operate(5, 3, division));
    }

    // to perform the operation
    private static double operate(double a, double b, MathOperation operation) {
        return operation.operate(a, b);
    }
}