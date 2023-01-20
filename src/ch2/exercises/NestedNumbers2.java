package ch2.exercises;

public class NestedNumbers2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
