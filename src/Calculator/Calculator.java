package Calculator;

public class Calculator {
    public static double calculate(double num1, double num2, char op) {
        switch (op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2 == 0) return Double.NaN;
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }
}
