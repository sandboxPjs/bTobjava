package ch5.exercises;

public class DigitRange {
    public static void main(String[] args) {
        System.out.println(digitRange(2000000000));
    }

    public static int digitRange(int number) {
        if (number / 10 == 0) {
            return 1;
        } else {
            int numberToHandle = Math.abs(number);
            int min = numberToHandle % 10;
            int max = min;
            // sum while number / 10 == 0
            while (numberToHandle / 10 != 0) {
                numberToHandle = numberToHandle / 10;
                int digit = numberToHandle % 10;
                if (digit < min) {
                    min = digit;
                } else if (digit > max) {
                    max = digit;
                }
            }
            return max - min + 1;
        }
    }
}
