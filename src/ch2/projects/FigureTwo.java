package ch2.projects;

public class FigureTwo {
    public static void main(String[] args) {
        printLine();
        for (int i = 0; i < 2; i++) {
            printTop();
        }
        printLine();
        for (int i = 0; i < 2; i++) {
            printBottom();
        }
        printLine();
    }

    public static void printLine() {
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void printTop() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("|");
            for (int j = 0; j < -1 * i + 3; j++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 0; j < -1 * i + 3; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void printBottom() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("|");
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("v");
            for (int j = 0; j < -2 * i + 6; j++) {
                System.out.print(" ");
            }
            System.out.print("v");
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
