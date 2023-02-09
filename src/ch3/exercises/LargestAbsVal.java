package ch3.exercises;

public class LargestAbsVal {
    public static void main(String[] args) {
        System.out.println(largestAbsVal(7, -2, -11));
        System.out.println(largestAbsVal(-4, 5, 2));
    }

    public static int largestAbsVal(int one, int two, int three) {
        return Math.max(Math.max(Math.abs(one), Math.abs(two)), Math.abs(three));
    }
}
