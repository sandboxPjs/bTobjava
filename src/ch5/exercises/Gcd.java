package ch5.exercises;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(24, 84));
        System.out.println(gcd(105, 45));
        System.out.println(gcd(0, 8));
    }

    public static int gcd(int first, int second) {
        int result;
        // swap until one of the numbers become 0
        while (second != 0) {
            result = second;
            second = first % second;
            first = result;
        }
         return Math.abs(second + first);
    }
}
