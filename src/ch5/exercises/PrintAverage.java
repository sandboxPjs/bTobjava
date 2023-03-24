package ch5.exercises;

import java.util.Scanner;

public class PrintAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printAverage(scanner);
    }

    public static void printAverage(Scanner scanner) {
        double sum = 0;
        int counter = 0;
        int number = 0;
        do {
            System.out.print("Type a number: ");
            number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
                counter++;
            }
        } while (number >= 0);
        if (counter > 0) {
            double average = sum / counter;
            System.out.println("Average was " + average);
        }
    }
}
