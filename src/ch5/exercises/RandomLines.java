package ch5.exercises;

import java.util.Random;

public class RandomLines {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines() {
        Random random = new Random();
        // get lines
        int linesNumber = random.nextInt(6) + 5;
        for (int i = 0; i < linesNumber; i++) {
            // get line
            int stringLength = random.nextInt(80) + 1;
            String line = "";
            for (int j = 0; j < stringLength; j++) {
                // get char
                char c = 0;
                while (c < 97 || c > 122) {
                    c = (char) (random.nextInt(26) + 97); // 97 - 122
                }
                line += c;
            }
            System.out.println(line);
        }
    }
}
