package ch3.exercises;

import java.util.Scanner;

public class InputBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputBirthday(scanner);
    }

    public static void inputBirthday(Scanner scanner) {
        System.out.print("On what day of the month were you born? ");
        int month = scanner.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String name = scanner.next();
        System.out.print("During what year were you born? ");
        int year = scanner.nextInt();
        System.out.print("You were born on " + name + " " + month + ", " + year + ". You're mighty old!");
    }
}
