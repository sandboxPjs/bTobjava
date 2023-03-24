package ch5.exercises;

import java.util.Random;

public class RandomX {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random random = new Random();
        String line;
        int number;
        do {
            line = "";
            number = random.nextInt(15) + 5;
            for (int i = 0; i < number; i++) {
                line += "x";
            }
            System.out.println(line);
        } while(line.length() < 16);
    }
}
