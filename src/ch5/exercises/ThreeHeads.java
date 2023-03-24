package ch5.exercises;

import java.util.Random;

public class ThreeHeads {
    public static void main(String[] args) {
        threeHeads();
    }

    public static void threeHeads() {
        Random random = new Random();
        int counter = 0;
        boolean isHead = false;
        // generate while 3 same side
        while (counter < 3) {
            int side = random.nextInt(2);
            if (side == 0) {
                System.out.print("T");
                isHead = false;
            } else {
                System.out.print("H");
                isHead = true;
            }
            System.out.print(" ");
            if (isHead) {
                counter++;
            } else {
                counter = 0;
            }
        }
        System.out.println();
        System.out.println("Three heads in a row!");
    }
}
