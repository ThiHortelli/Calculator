import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                double num1, num2, result;
                char operator;

                System.out.println("Enter the first number:");
                num1 = scanner.nextDouble();

                System.out.println("Enter the second number:");
                num2 = scanner.nextDouble();

                System.out.println("Enter the operator (+, -, *, /):");
                operator = scanner.next().charAt(0);

                switch(operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator.");
                }

                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                exit = true;
            }
        }

        System.out.println("Goodbye!");
    }
}
