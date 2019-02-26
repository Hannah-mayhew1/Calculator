package hannahmayhew.Calculator;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator");
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your first number:");
            int first = scanner.nextInt();

            Calculation Calculation = null;
            while (Calculation == null) {
                Calculation = chooseOperation();
            }

            System.out.println("Enter your second number:");
            int second = scanner.nextInt();

            int answer = Calculation.calculate(first, second);

            System.out.println("The answer is: " + answer);
        }
    }

    private static Calculation chooseOperation() {
            System.out.println("Choose an operation: +/*/-");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            if (input.equals("+")) {
                return new Add();
            } else if (input.equals("*")) {
                return new Multiply();
            } else if (input.equals("-")) {
                return new Subtract();
            } else {
                System.out.println("Invalid operation");
                return null;
            }


        }
    }