package ch2.exercises;

public class NumbersOutput {
    public static final int REPETITIONS = 2;
    public static final int RANGE = 7;

    public static void main(String[] args) {
        for (int i = 0; i < REPETITIONS; i++) {
            for (int j = 0; j < RANGE - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < REPETITIONS; i++) {
            for (int j = 1; j < RANGE; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}
