package hannahmayhew.Calculator;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            System.out.println("Welcome to the Calculator");
            while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your first number:");
            int first = scanner.nextInt();

            System.out.println("Choose an operation: +/*/-");
            String input = scanner.next();
            int answer;

            System.out.println("Enter your second number:");
            int second = scanner.nextInt();

            if (input.equals("+")) {
                answer = first + second;
            } else if (input.equals("*")) {
                answer = first * second;
            } else if (input.equals("-")) {
                answer = first - second;
            } else {
                System.out.println("Invalid operation");
                return;
            }

            System.out.println("The answer is: " + answer);
        }
    }
}
