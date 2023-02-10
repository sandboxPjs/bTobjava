package ch3.projects;

public class ChristmasTree {
    public static void main(String[] args) {
        printSegments(2,5 );
    }

    public static void printSegments(int numberOfSegments, int height) {
        for (int i = 1; i <= numberOfSegments; i++) {
            for (int j = 1; j <= height; j++) {
                for (int k = 0; k < - j - i + height  + numberOfSegments; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < j + i - 2; k++) { // j - 1 + i - 1
                    System.out.print("*");
                }
                System.out.print("*");
                for (int k = 0; k < j + i - 2; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < - j - i + height  + numberOfSegments; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        // printTrunk
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height + numberOfSegments - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        // printBottom
        for (int j = 0; j < height + numberOfSegments - 5; j++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
    }
}
