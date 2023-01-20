package ch2.projects;

public class FigureThree {
    public static void main(String[] args) {
        // print line
        printLine();
        // print top
        printTop();
        // print bottom
        printBottom();
        // print line
        printLine();
        // print bottom
        printBottom();
        // print top
        printTop();
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

    }
    public static void printBottom() {

    }
}
