import java.util.Scanner;

public class week5cal {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        // step 1: ask to chose one of the following operation to begin
        System.out.println("Choose an operation (+, -, *, /)or type 'exit' to quit");
        String operation = scan.next();
        //Step 2: Exit if user types 'exit'
        if (operation.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the calculator.");
            break;
        }
        //step 3:Get two numbers from the user
        System.out.print("Enter the first number:");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number:");
        double num2 =  scan.nextDouble();

        //step 4 perform the operation
        switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
            case "*":
                System.out.println("Result: " + (num1 * num2));
            case "/":
                if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println ("Error: cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation. Please chose +,-,*, or / ");
        }
        }
        //close the scanner
        scan.close();

    }

}

