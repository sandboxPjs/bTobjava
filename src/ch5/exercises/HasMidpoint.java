package ch5.exercises;

public class HasMidpoint {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(4,6,8));
        System.out.println(hasMidpoint(2,10,6));
        System.out.println(hasMidpoint(8,8,8));
        System.out.println(hasMidpoint(25,10,-5));
        System.out.println();
        System.out.println(hasMidpoint(3, 1, 3));
        System.out.println(hasMidpoint(1, 3, 1));
        System.out.println(hasMidpoint(21, 9, 58));
        System.out.println(hasMidpoint(2, 8, 16));
    }

    public static boolean hasMidpoint(int one, int two, int three) {
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
        // check midpoint
        if (average - min == max - average) {
            return true;
        } else {
            return false;
        }
    }
}
