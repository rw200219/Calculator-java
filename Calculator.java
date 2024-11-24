import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Simple Calculator!- Rebecca's Version");

        while (running) {
            // Display the menu
            System.out.println("What would you like to calculate?");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. NOTHING- Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Bye for now!");
                running = false;
                continue;
            }

            // Get input numbers
            System.out.print("Enter the first number for the equation: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number for the equation: ");
            double num2 = scanner.nextDouble();

            // Perform the chosen operation
            switch (choice) {
                case 1: // Addition
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2: // Subtraction
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3: // Multiplication
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4: // Division
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not accepted!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }

        scanner.close();
    }
}