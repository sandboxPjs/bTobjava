package ch2.projects;

public class FigureSeven {
    public static final int SIZE = 4;
    public static void main(String[] args) {
        printNeedle();
        printTop();
        printLine();
        printBottom();
        printNeedle();
        printColumn();
        printTop();
        printLine();
    }
    public static void printNeedle() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 0; j < 3 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.print("||");
            for (int j = 0; j < 3 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printTop() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 0; j < -3 * i + 3 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int j = 0; j < 3 * i - 3; j++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int j = 0; j < 3 * i - 3; j++) {
                System.out.print(":");
            }
            System.out.print("\\__");
            for (int j = 0; j < -3 * i + 3 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printLine() {
        System.out.print("|");
        for (int i = 0; i < 6 * SIZE; i++) {
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }
    public static void printBottom() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = 0; j < -2 * i + (3 * SIZE + 1); j++) {
                System.out.print("/\\");
            }
            System.out.print("_/");
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printColumn() {
        for (int i = 1; i <= 4 * SIZE; i++) {
            for (int j = 0; j < 3 * SIZE - 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2; j++) {
                System.out.print("|");
                for (int k = 0; k < 2; k++) {
                    System.out.print("%");
                }
                System.out.print("|");
            }
            for (int j = 0; j < 3 * SIZE - 3; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
