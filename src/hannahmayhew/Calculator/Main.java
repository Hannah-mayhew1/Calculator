package hannahmayhew.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator");

        while (true) {

            List<Integer> numTot = chooseNumbers();

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

    private static List<Integer> chooseNumbers() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numTot = new ArrayList<>();

        while (scanner.hasNextInt()) {
            System.out.println("Enter a number or 'finished':");
            numTot.add(scanner.nextInt());
        }

        return numTot;
    }

    private static int calculate(Calculation calculation, List<Integer> numTot) {
        int answer = numTot.get(0);
        for (int i = 1; i < numTot.size(); i++) {
            answer = calculation.calculate(answer, numTot.get(i));
        }
        return answer;
    }

}
