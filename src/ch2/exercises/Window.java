package ch2.exercises;

public class Window {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        createBorderLine();
        for (int i = 0; i < SIZE; i++) {
            createWindowLine();
        }
        createBorderLine();
        for (int i = 0; i < SIZE; i++) {
            createWindowLine();
        }
        createBorderLine();
    }

    public static void createBorderLine() {
        System.out.print("+");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("=");
        }
        System.out.print("+");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("=");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void createWindowLine() {
        System.out.print("|");
        for (int j = 0; j < SIZE; j++) {
            System.out.print(" ");
        }
        System.out.print("|");
        for (int j = 0; j < SIZE; j++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
    }
}
