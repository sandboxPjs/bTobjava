package ch5.exercises;

public class HasAnOddDigit {
    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(4822116));
        System.out.println(hasAnOddDigit(2448));
    }

    public static boolean hasAnOddDigit(int number) {
        boolean hasAnOddDigit = false;
        number = Math.abs(number);
        while(number / 10 != 0) {
            // get digit
            int digit = number % 10;
            // check is digit odd
            if (digit % 2 == 1) {
                hasAnOddDigit = true;
            }
            number = number / 10;
        }
        // check first digit
        if (number % 2 == 1) {
            hasAnOddDigit = true;
        }

        return hasAnOddDigit;
    }
}
