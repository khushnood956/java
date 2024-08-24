import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input first number
            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();
            
            // Input second number
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();
            
            // Choose operator
            System.out.print("Choose operator! 1 for add, 2 for subtract, 3 for multiply, 4 for divide: ");
            int operator = sc.nextInt();
            
            // Perform operation
            switch (operator) {
                case 1 -> System.out.println("Result: " + (num1 + num2));
                case 2 -> System.out.println("Result: " + (num1 - num2));
                case 3 -> System.out.println("Result: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                }
                default -> System.out.println("Invalid operator selected. Please choose 1, 2, 3, or 4.");
            }
        }
        
        System.out.println("Thanks for using the calculator!");
    }
}
