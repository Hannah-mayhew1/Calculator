package hannahmayhew.Calculator;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator");

        while (true) {

            int[] numTot = chooseNumbers();

            Calculation Calculation = null;
            while (Calculation == null) {
                Calculation = chooseOperation();
            }

            int answer = calculate(Calculation, numTot);

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

    private static int[] chooseNumbers() {
        System.out.println("How many numbers would you like to use?");
        Scanner scanner = new Scanner(System.in);
        int numQuant = scanner.nextInt();

        int[] numTot = new int[numQuant];

        for (int i = 1; i <= numQuant; i++) {
            System.out.println("Enter Number " + i + ":");
            numTot[i - 1] = scanner.nextInt();
        }
        return numTot;
    }

    private static int calculate(Calculation calculation, int[] numTot) {
        int answer = numTot[0];
        for (int i = 1; i < numTot.length; i++) {
            answer = calculation.calculate(answer, numTot[i]);
        }
        return answer;
    }
}
