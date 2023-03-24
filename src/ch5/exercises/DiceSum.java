package ch5.exercises;

import java.util.Random;
import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args) {
        diceSum();
    }

    public static void diceSum() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // prompt user
        System.out.print("Desired dice sum: ");
        int desiredSum = scanner.nextInt();
        int sum = 0;
        // roll and examine while sum == user prompt
        while (sum != desiredSum) {
            int first = random.nextInt(6) + 1;
            int second = random.nextInt(6) + 1;
            sum = first + second;
            System.out.printf("%d and %d = %d\n", first, second, sum);
        }
    }
}
