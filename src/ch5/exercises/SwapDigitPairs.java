package ch5.exercises;

public class SwapDigitPairs {
    public static void main(String[] args) {
        System.out.println("Basic tests");
        int product = 482596;
        int result = swapDigitPairs(product);
        System.out.printf("%s -> %s\n", product, result);
        product = 1234567;
        result = swapDigitPairs(product);
        System.out.printf("%s -> %s\n", product, result);
        System.out.println();
        System.out.println("Extra tests");
        product = 29107;
        result = swapDigitPairs(product);
        System.out.printf("%s -> %s\n", product, result);
        product = 9898;
        result = swapDigitPairs(product);
        System.out.printf("%s -> %s\n", product, result);
        product = 120011021;
        result = swapDigitPairs(product);
        System.out.printf("%s -> %s\n", product, result);
    }
    public static int swapDigitPairs(int number) {
        int part = number;
        int prev = 0;
        int next = 0;
        int counter = 0;

        while(part / 10 != 0) {
            // get 2 digits
            prev = part % 10;
            part = part / 10;
            next = part % 10;
            // get factors for each digit
            int prevFactor = (next - prev) * getFactor(counter);
            int nextFactor = (prev - next) * getFactor(++counter);
            // add factors to number
            number = number + prevFactor + nextFactor;
            // skip one digit because it's already swapped
            part = part / 10;
            counter++;
        }
        return number;
    }

    public static int getFactor(int n) {
        return (int) ( Math.pow(10, n));
    }
}
