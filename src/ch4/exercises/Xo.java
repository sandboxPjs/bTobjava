package ch4.exercises;

public class Xo {
    public static void main(String[] args) {
        xo(0);
        System.out.println();
        xo(1);
        System.out.println();
        xo(3);
        System.out.println();
        xo(5);
        System.out.println();
        xo(8);
        System.out.println();
        xo(11);
        System.out.println();
        xo(12);
    }

    public static void xo (int size) {
        if (size > 1) {
            if (size % 2 == 0) {
                // print upXo
                for (int i = 1; i <= size / 2; i++) {
                    for (int k = 0; k < i - 1; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < -2 * i + size; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < i - 1; k++) {
                        System.out.print("o");
                    }
                    System.out.println();
                }
                // print downXo
                for (int i = 1; i <= size / 2; i++) {
                    for (int k = 0; k < -i + size / 2; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < 2 * i - 2; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < -i + size / 2; k++) {
                        System.out.print("o");
                    }
                    System.out.println();
                }
            } else {
                // print upXo
                for (int i = 1; i <= (size - 1) / 2; i++) {
                    for (int k = 0; k < i - 1; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < -2 * i + size; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < i - 1; k++) {
                        System.out.print("o");
                    }
                    System.out.println();
                }
                // print line
                for (int i = 0; i < (size - 1) / 2; i++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int i = 0; i < (size - 1) / 2; i++) {
                    System.out.print("o");
                }
                System.out.println();
                // print downXo
                for (int i = 1; i <= (size - 1) / 2; i++) {
                    for (int k = 0; k < -i + (size - 1) / 2; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k <  2 * i - 1; k++) {
                        System.out.print("o");
                    }
                    System.out.print("x");
                    for (int k = 0; k < -i + (size - 1) / 2; k++) {
                        System.out.print("o");
                    }
                    System.out.println();
                }
            }
        } else if (size == 1) {
            System.out.print("x");
            System.out.println();
        }
    }
}
