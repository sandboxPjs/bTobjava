package ch2.projects;

public class FigureOne {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < -1 * i + 7; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < -2 * i + 14; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < -1 * i + 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
