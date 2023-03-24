package ch5.exercises;

public class FirstDigit {
    public static void main(String[] args) {

    }

    public static int firstDigit(int number) {
        int numberToHandle = Math.abs(number);
        int sum = 0;
        // sum while number / 10 == 0
        while (numberToHandle / 10 != 0) {
            sum += numberToHandle % 10;
            numberToHandle = numberToHandle / 10;
        }

        return numberToHandle;
    }
}
