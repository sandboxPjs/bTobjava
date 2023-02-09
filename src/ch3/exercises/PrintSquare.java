package ch3.exercises;

public class PrintSquare {
    public static void main(String[] args) {
        printSquare(1, 5);
        System.out.println();
        printSquare(3, 9);
        System.out.println();
        printSquare(0, 3);
        System.out.println();
        printSquare(5, 5);
    }

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
