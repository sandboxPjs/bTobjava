package ch5.exercises;

public class Dominant {
    public static void main(String[] args) {
        System.out.println(dominant(4, 9, 2));
        System.out.println(dominant(5, 3, 7));
    }

    public static boolean dominant(int one, int two, int three) {
        if (one > two + three) {
            return true;
        } else if (two > one + three) {
            return true;
        } else if (three > one + two) {
            return true;
        } else {
            return false;
        }
    }
}
