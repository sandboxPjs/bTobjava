package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoyGirl {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        boyGirl(input);
        // just read and sum
        // differ boys and girls
    }

    public static void boyGirl(Scanner input) {
        // token style
        // while there is a token
        // read name
        // read number
        // calculate sum
        // print the results
        int sumBoys = 0;
        int sumGirls = 0;
        int counterBoys = 0;
        int counterGirls = 0;
        int counterBoysGirls = 0;
        while (input.hasNext()) {
            String name = input.next();
            int number = input.nextInt();
            if (counterBoysGirls % 2 == 0) {
                sumBoys += number;
                counterBoys++;
            } else {
                sumGirls += number;
                counterGirls++;
            }
            counterBoysGirls++;
        }

        System.out.printf("%d boys, %d girls\n", counterBoys, counterGirls);
        System.out.println("Difference between boys' and girls' sums: " + (Math.abs(sumBoys - sumGirls)));
    }
}
