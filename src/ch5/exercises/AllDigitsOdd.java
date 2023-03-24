package ch5.exercises;

public class AllDigitsOdd {
    public static void main(String[] args) {
        System.out.println(allDigitsOdd(4822116));
        System.out.println(allDigitsOdd(-137));
    }

    public static boolean allDigitsOdd(int number) {
        number = Math.abs(number);
        while(number / 10 != 0) {
            // get digit
            int digit = number % 10;
            // check is digit odd
            if (digit % 2 == 0) {
                return false;
            }
            number = number / 10;
        }
        // check first digit
        if (number % 2 == 0) {
            return false;
        }

        return true;
    }
}
