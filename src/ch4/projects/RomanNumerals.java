package ch4.projects;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readNumber(scanner);
        showRomanian(number);
    }

    public static int readNumber(Scanner scanner) {
        System.out.print("Print integer positive number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            throw new IllegalArgumentException(" number must be positive!");
        }

        return number;
    }

    /*
    * This method allow to transform numbers in arabic notation into roman notation
    * Transformation rules:
    * * 3 identical digits in a row (maximum)
    * * addition rule (if the smaller number is after)
    * * rule of subtraction (if the smaller number is in front of)
    * * only positive integers greater than 0 can be transformed
    * * maximum number is 3999
    * * there are 4 groups of numbers: thousands, hundreds, tens, units
    * */
    public static void showRomanian(int number) {
        int thousands = number / 1000;
        int hundreds = number % 1000 / 100;
        int tens = number % 100 / 10;
        int units = number % 10;

        System.out.print("Roman numerals: ");
        // thousands
        if (thousands < 4) {
            for (int i = 0; i < thousands; i++) {
                System.out.print("M");
            }
        }
        // hundreds
        if (hundreds < 4) {
            for (int i = 0; i < hundreds; i++) {
                System.out.print("C");
            }
        } else if (hundreds == 4) {
            System.out.print("C");
            System.out.print("D");
        } else if (hundreds == 5) {
            System.out.print("D");
        } else if (hundreds > 5 && hundreds < 9) {
            System.out.print("D");
            for (int i = 0; i < hundreds - 5; i++) {
                System.out.print("C");
            }
        } else if (hundreds == 9) {
            System.out.print("C");
            System.out.print("M");
        }
        // tens
        if (tens < 4) {
            for (int i = 0; i < tens; i++) {
                System.out.print("X");
            }
        } else if (tens == 4) {
            System.out.print("X");
            System.out.print("L");
        } else if (tens == 5) {
            System.out.print("L");
        } else if (tens > 5 && tens < 9) {
            System.out.print("L");
            for (int i = 0; i < tens - 5; i++) {
                System.out.print("X");
            }
        } else if (tens == 9) {
            System.out.print("X");
            System.out.print("C");
        }
        // units
        if (units < 4) {
            for (int i = 0; i < units; i++) {
                System.out.print("I");
            }
        } else if (units == 4) {
            System.out.print("I");
            System.out.print("V");
        } else if (units == 5) {
            System.out.print("V");
        } else if (units > 5 && units < 9) {
            System.out.print("V");
            for (int i = 0; i < units - 5; i++) {
                System.out.print("I");
            }
        } else if (units == 9) {
            System.out.print("I");
            System.out.print("X");
        }
    }
}
