package ch4.exercises;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(3,4));
    }

    public static int pow (int base, int exponent) {
        int product = 1;
        for (int i = 0; i < exponent; i++) {
            product *= base;
        }

        return product;
    }
}
