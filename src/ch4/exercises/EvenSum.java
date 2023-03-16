package ch4.exercises;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        evenSum();
    }

    public static void evenSum() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        System.out.print("how many integers? ");
        int amount = scanner.nextInt();

        System.out.print("next integer? ");
        int number = scanner.nextInt();
        max = number;
        sum += number;

        for (int i = 1; i < amount; i++) {
            System.out.print("next integer? ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                if (number > max) {
                    max = number;
                }
                sum += number;
            }
        }
        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}
