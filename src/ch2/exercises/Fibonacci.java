package ch2.exercises;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;

        System.out.print("1" + " " + "1" + " ");

        for (int i = 3; i <= 12; i++) {
            int sum = first + second;
            System.out.print(sum + " ");

            first = second;
            second = sum;
        }
    }
}
