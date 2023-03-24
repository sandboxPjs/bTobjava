package ch5.exercises;

public class PrintFactors {
    public static void main(String[] args) {
        printFactors(24);
    }

    public static void printFactors(int number) {
        System.out.print("1");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(" and ");
                System.out.print(i);
            }
        }
    }
}
