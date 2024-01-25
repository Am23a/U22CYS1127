import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int num1 = getValidInteger(scanner);

        System.out.print("Enter the second digit: ");
        int num2 = getValidInteger(scanner);

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        int result = 0;

        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static int getValidInteger(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 0&& num <= 99) {
                    return num;
                } else {
                    System.out.println("Error: Digits should be between 0 and 99.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}


