import java.util.Scanner;

public class Calculator_app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print(">");
        String expression = scanner.nextLine();

        try {
            String[] parts = expression.split(" ");
            double num1 = Double.parseDouble(parts[0]);
            char operator = parts[1].charAt(0);
            double num2 = Double.parseDouble(parts[2]);

            double result = 0;
            switch (operator) {
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
                        throw new ArithmeticException("Division by zero");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println(expression + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid expression: Please enter numbers and a valid operator");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }
        
        }
    }
}
