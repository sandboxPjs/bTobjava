package ch4.exercises;

public class PrintRange {
    public static void main(String[] args) {
        printRange(2, 7);
        System.out.println();
        printRange(19, 11);
        System.out.println();
        printRange(5, 5);
    }

    public static void printRange(int first, int second) {
        if (first < second) {
            for (int i = first; i <= second; i++) {
                System.out.print(i + " ");
            }
        } else if (first > second) {
            for (int i = first; i >= second; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print(first);
        }
    }
}
