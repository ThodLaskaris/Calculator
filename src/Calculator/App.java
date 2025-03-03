package Calculator;

import java.util.Scanner;

import static Calculator.Calculator.calculate;

public class App {
    public static void main(String[] args) {
        System.out.println(Message.WELCOME_MSG.getText());

        Scanner sc = new Scanner(System.in);

        while (true) {
            double num1 = getNumber(sc, Message.FIRST_NUM.getText());
            char op = getOperator(sc, Message.OPERATOR.getText());
            double num2 = getNumber(sc, Message.SECOND_NUM.getText());

            double result = calculate(num1, num2, op);

            if (Double.isNaN(result)) {
                System.out.println(Message.ERROR_MSG.getText());
            } else {
                System.out.println(Message.RESULT_MSG.getText() + result);
            }

            System.out.println(Message.EXIT_MSG.getText());
            sc.nextLine();
            String exitChoice = sc.nextLine().toLowerCase().trim();
            if (exitChoice.equals("exit")) {
                break;
            }
        }

        sc.close();
    }

    private static double getNumber(Scanner sc, String message) {
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static char getOperator(Scanner sc, String message) {
        System.out.println(message);
        while (true) {
            String input = sc.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println(Message.INVALID_MSG.getText() + "\nPlease enter one of ( + , - , * , /):");
            }
        }
    }
}
