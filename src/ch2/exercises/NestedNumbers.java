package ch2.exercises;

public class NestedNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
