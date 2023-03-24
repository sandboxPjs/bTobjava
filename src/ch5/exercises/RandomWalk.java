package ch5.exercises;

import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        Random random = new Random();
        int position = 0;
        System.out.println("position = " + position);
        int maxPosition = position;
        // walk until Math.abs(x) == 3
        while(Math.abs(position) != 3) {
            // get dimension/call random
            int dimension = random.nextInt(2);
            // make step
            if (dimension == 0) {
                position += 1;
            } else if (dimension == 1) {
                position -= 1;
            }
            if (position > maxPosition) {
                maxPosition = position;
            }

            System.out.println("position = " + position);
        }
        System.out.println("max position = " + maxPosition);
    }
}
