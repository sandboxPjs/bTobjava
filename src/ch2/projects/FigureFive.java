package ch2.projects;

public class FigureFive {
     public static final int SIZE = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            // top
            for (int j = 0; j < -5 * i + 5 * SIZE; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            System.out.print("o");
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 * i - 5; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            // middle
            for (int j = 0; j < -5 * i + 5 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            System.out.print("/|\\");
            System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 * i - 5; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            // bottom
            for (int j = 0; j < -5 * i + 5 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            System.out.print("/ \\");
            System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 * i - 5; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        // floor
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < 5 * SIZE; i++) {
            System.out.print("*");
        }
        System.out.print("*");
    }
}
