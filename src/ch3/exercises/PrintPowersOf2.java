package ch3.exercises;

public class PrintPowersOf2 {
    public static void main(String[] args) {
        printPowersOf2(0);
        System.out.println();
        printPowersOf2(1);
        System.out.println();
        printPowersOf2(3);
        System.out.println();
        printPowersOf2(10);
        System.out.println();
    }
     //with Math
    public static void printPowersOf2(int power) {
        for (int i = 0; i <= power; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }

    // without Math
//    public static void printPowersOf2(int power) {
//        int number = 1;
//        System.out.print(number + " ");
//        for (int i = 1; i <= power; i++) {
//            number *= 2;
//            System.out.print(number + " ");
//        }
//    }
}
