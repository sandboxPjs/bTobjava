package ch2.exercises;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int j = 1; j <= -1 * i + 7; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
