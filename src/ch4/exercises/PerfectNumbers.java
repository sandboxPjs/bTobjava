package ch4.exercises;

public class PerfectNumbers {
    public static void main(String[] args) {
        perfectNumbers(6);
        perfectNumbers(500);
    }

    public static void perfectNumbers(int max) {
        if (max > 0) {
            if (max < 6) {
                System.out.printf("Perfect numbers up to %d: ", max);
            } else if (max >= 6 && max < 28) {
                System.out.printf("Perfect numbers up to %d: 6", max);
            } else if (max >= 28 && max < 496) {
                System.out.printf("Perfect numbers up to %d: 6 28", max);
            } else if (max >= 496 && max < 8128) {
                System.out.printf("Perfect numbers up to %d: 6 28 496", max);
            } else if (max >= 8128 && max < 33550336) {
                System.out.printf("Perfect numbers up to %d: 6 28 496 8128", max);
            } else if (max >= 33550336 && max < 2147483647) {
                System.out.printf("Perfect numbers up to %d: 6 28 496 8128 33550336", max);
            }
        } else {
            System.out.printf("Perfect numbers up to %d: ", max);
        }
    }
}
