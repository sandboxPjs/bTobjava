package ch2.exercises;

public class NumbersOutput60 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}
