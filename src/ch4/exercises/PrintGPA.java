package ch4.exercises;

import java.util.Scanner;

public class PrintGPA {
    public static void main(String[] args) {
        printGPA();
    }

    public static void printGPA() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        double score = 0.0;
        int amount = 0;
        double sum = 0.0;
        System.out.print("Enter a student record: ");
        name = scanner.next();
        amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            sum+=scanner.nextInt();
        }
        score = sum / amount;

        System.out.printf("%s's grade is ", name);
        System.out.println(score);
    }
}
