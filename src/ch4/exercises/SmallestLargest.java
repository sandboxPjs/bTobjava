package ch4.exercises;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        smallestLargest();
    }

    public static void smallestLargest() {
        Scanner scanner = new Scanner(System.in);
        int min;
        int max;
        System.out.print("How many numbers do you want to enter? ");
        int amount = scanner.nextInt();
        System.out.printf("Number %d: ", 1);
        min = scanner.nextInt();
        max = min;
        for (int i = 2; i <= amount; i++) {
            System.out.printf("Number %d: ", i);
            int number = scanner.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Smallest = " + min);
        System.out.printf("Largest = " + max);
    }
}
