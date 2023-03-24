package ch5.exercises;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(29107));
    }

    public static int digitSum(int number) {
        int numberToHandle = Math.abs(number);
        int sum = 0;
        // sum while number / 10 == 0
        while (numberToHandle / 10 != 0) {
            sum += numberToHandle % 10;
            numberToHandle = numberToHandle / 10;
        }
        // add remainder to sum
        return sum + numberToHandle;
    }
}
