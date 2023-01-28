package ch2.projects;

public class FigureFour {
    public static void main(String[] args) {
        printLine();
        printTop();
        printMiddle();
        printBottom();
        printLine();
    }

    public static void printLine() {
        System.out.print("|");
        for (int i = 0; i < 10; i++) {
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }
    public static void printTop() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 0; j < -2 * i + 10; j++) {
                System.out.print(":");
            }
            System.out.print("/");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printMiddle() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
        System.out.print("||");
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void printBottom() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < -1 * i + 5; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(":");
            }
            System.out.print("\\");
            for (int j = 0; j < -1 * i + 5; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
