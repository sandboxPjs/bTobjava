package ch2.projects;

public class FigureSix {
    public static final int SIZE = 5;
    public static void main(String[] args) {
        printCone();
        printLine();
        printBlockTop();
        printBlockBottom();
        printLine();
        printBlockBottom();
        printBlockTop();
        printLine();
        printCone();
    }

    public static void printCone() {
        for (int i = 1; i <= 2 * SIZE - 1; i++) {
            for (int j = 0; j < -1 * i + 2 * SIZE; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 0; j < i; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < -1 * i + 2 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printLine() {
        System.out.print("+");
        for (int i = 0; i < 2 * SIZE; i++) {
            System.out.print("=");
            System.out.print("*");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void printBlockTop() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < -1 * i + SIZE; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/\\");
            }
            for (int j = 0; j < -2 * i + 2 * SIZE; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/\\");
            }
            for (int j = 0; j < -1 * i + SIZE; j++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void printBlockBottom() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < i - 1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < -1 * i + (SIZE + 1); j++) {
                System.out.print("\\/");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < -1 * i + (SIZE + 1); j++) {
                System.out.print("\\/");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
