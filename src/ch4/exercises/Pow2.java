package ch4.exercises;

public class Pow2 {
    public static void main(String[] args) {
        System.out.println(pow2(2.0, -2));
    }

    public static double pow2(double base, int exponent) {
        double product = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                product *= base;
            }
        } else if (exponent < 0) {
            for (int i = 0; i < Math.abs(exponent); i++) {
                product *= base;
            }
            product = 1 / product;
        }

        return product;
    }
}
