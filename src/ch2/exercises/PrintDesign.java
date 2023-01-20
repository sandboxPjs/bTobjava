package ch2.exercises;

public class PrintDesign {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < -1 * i + 6; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(2 * i - 1);
            }
            for (int j = 0; j < -1 * i + 6; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
