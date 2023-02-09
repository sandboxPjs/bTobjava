package ch3.exercises;

public class LargerAbsVal {
    public static void main(String[] args) {
        System.out.println(largerAbsVal(11, 2));
        System.out.println(largerAbsVal(4, -5));
    }

    public static int largerAbsVal(int one, int two) {
        return Math.max(Math.abs(one), Math.abs(two));
    }
}
