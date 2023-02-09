package ch3.exercises;

public class PrintPowersOfN {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        System.out.println();
        printPowersOfN(5, 6);
        System.out.println();
        printPowersOfN(-2, 8);
    }

    // with Math class
    public static void printPowersOfN(int n, int power) {
        for (int i = 0; i <= power; i++) {
            System.out.print((int) Math.pow(n, i) + " ");
        }
    }

    // without Math class
//    public static void printPowersOfN(int n, int power) {
//        int number = 1;
//        System.out.print(number + " ");
//        for (int i = 1; i <= power; i++) {
//            number *= n;
//            System.out.print(number + " ");
//        }
//    }
}
