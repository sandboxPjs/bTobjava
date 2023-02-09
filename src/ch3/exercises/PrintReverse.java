package ch3.exercises;

public class PrintReverse {
    public static void main(String[] args) {
        printReverse("hello there!");
    }

    public static void printReverse(String data) {
        for (int i = data.length() - 1; i >= 0 ; i--) {
            System.out.print(data.charAt(i));
        }
    }
}
