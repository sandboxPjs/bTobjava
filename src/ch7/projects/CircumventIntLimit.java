package ch7.projects;

import java.util.Arrays;
import java.util.Scanner;

public class CircumventIntLimit {
    public static void main(String[] args) {
        intro();
        Scanner scanner = new Scanner(System.in);
        String firstNumber = getNumber(scanner);
        String secondNumber = getNumber(scanner);
        int[] numberInArray1 = transformNumberToArray(firstNumber);
        int[] numberInArray2 = transformNumberToArray(secondNumber);
        int[] resultArray = sumArrays(numberInArray1, numberInArray2);
        String resultNumber = transformArrayToNumber(resultArray);
        printResult(resultNumber);
    }

    public static void intro() {
        System.out.println("This program allow you to add two big numbers.");
        System.out.println();
    }
    public static String getNumber(Scanner scanner) {
        System.out.print("Print number: ");
        String number = scanner.next();
        while(!isCorrectNumber(number)) {
            System.out.println("Number should contains only digits!");
            System.out.print("Print number: ");
            number = scanner.next();
        }
        return number;
    }

    public static boolean isCorrectNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int[] transformNumberToArray(String number) {
        int[] array = new int[number.length()];
        for (int i = 0; i < array.length; i++) {
            if (number.charAt(i) == 48) {
                array[i] = 0;
            } else if (number.charAt(i) == 49) {
                array[i] = 1;
            } else if (number.charAt(i) == 50) {
                array[i] = 2;
            } else if (number.charAt(i) == 51) {
                array[i] = 3;
            } else if (number.charAt(i) == 52) {
                array[i] = 4;
            } else if (number.charAt(i) == 53) {
                array[i] = 5;
            } else if (number.charAt(i) == 54) {
                array[i] = 6;
            } else if (number.charAt(i) == 55) {
                array[i] = 7;
            } else if (number.charAt(i) == 56) {
                array[i] = 8;
            } else if (number.charAt(i) == 57) {
                array[i] = 9;
            }
        }
        return array;
    }

    public static int[] sumArrays(int[] first, int[] second) {
        int[] result = new int[Math.max(first.length, second.length)];
        int counter = 0;
        int nextDigit = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            int firstTemp = 0;
            int secondTemp = 0;
            if (first.length - 1 + counter >= 0) {
                firstTemp = first[first.length - 1 + counter];
            }
            if (second.length - 1 + counter >= 0) {
                secondTemp = second[second.length - 1 + counter];
            }
            int resultValue = firstTemp + secondTemp + nextDigit;
            nextDigit = resultValue / 10;
            result[i] = resultValue % 10;
            counter--;
        }
        if (nextDigit > 0) { // extend array size
            result = Arrays.copyOf(result, result.length + 1);
            // shift to the right
            for (int i = result.length - 1; i >= 1; i--) {
                result[i] = result[i - 1];
            }
            result[0] = nextDigit;
        }
        return result;
    }

    public static String transformArrayToNumber(int[] data) {
        String result= "";
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }

    public static void printResult(String resultNumber) {
        System.out.println("Result number: " + resultNumber);
    }
}
