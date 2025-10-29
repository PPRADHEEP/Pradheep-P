import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    // Constructor
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    // Method to perform the calculation
    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
            case "+":
                return a + b;

            case "sub":
            case "subtract":
            case "subtraction":
            case "-":
                return a - b;

            case "mul":
            case "multiply":
            case "multiplication":
            case "*":
                return a * b;

            case "div":
            case "divide":
            case "division":
            case "/":
                if (b != 0)
                    return a / b;
                else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }

            default:
                System.out.println("Invalid operation type!");
                return Double.NaN;
        }
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div or +, -, *, /): ");
        String operation = sc.next();

        // Create calculator object
        Calculator calc = new Calculator(a, b, operation);

        // Perform calculation
        double result = calc.calculate();

        // Display result
        System.out.println("Result: " + result);

        sc.close();
    }
}
