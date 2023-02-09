package ch3.exercises;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(15);
    }
    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("[" + i + "] ");
        }
    }
}
