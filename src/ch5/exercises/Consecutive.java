package ch5.exercises;

public class Consecutive {
    public static void main(String[] args) {
        System.out.println(consecutive(1, 2, 3));
        System.out.println(consecutive(3, 2, 4));
        System.out.println(consecutive(-10, -8, -9));
        System.out.println();
        System.out.println(consecutive(3, 5, 7));
        System.out.println(consecutive(1, 2, 2));
        System.out.println(consecutive(7, 7, 9));
    }

    public static boolean consecutive(int one, int two, int three) {
        // find smallest +
        // find biggest +
        // check if biggest + 2 = smallest +
        // if so check last number is smallest + 1

        // find smallest
        int min = Math.min(Math.min(one, two), three);

        // find biggest
        int max = Math.max(Math.max(one, two), three);

        // find average
        int average;
        if (min == one) {
            // average = two or three
            if (max == two) {
                average = three;
            } else {
                average = two;
            }
        } else if (min == two) {
            // average = one or three
            if (max == one) {
                average = three;
            } else {
                average = one;
            }
        } else { // min = three
            // average = one or two
            if (max == one) {
                average = two;
            } else {
                average = one;
            }
        }

        // check if biggest + 2 = smallest
        if (min + 2 == max) {
            // if so check last number is smallest + 1
            if (min + 1 == average) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
