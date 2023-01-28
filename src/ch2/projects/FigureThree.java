package ch2.projects;

public class FigureThree {
    public static void main(String[] args) {
        printLine();
        printTop();
        printBottom();
        printLine();
        printBottom();
        printTop();
        printLine();
    }

    public static void printLine() {
        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void printTop() {
        for (int i = 1; i <= 4; i++) {
            System.out.print("|");
            for (int j = 0; j < -1 * i + 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int j = 0; j < i - 1; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < -1 * i + 5; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void printBottom() {
        for (int i = 1; i <= 4; i++) {
            System.out.print("|");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < -1 * i + 4; j++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int j = 0; j < -1 * i + 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
