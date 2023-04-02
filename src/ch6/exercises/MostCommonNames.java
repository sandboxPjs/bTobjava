package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostCommonNames {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        System.out.println(mostCommonNames(input));

        // count un names +
        // print results after each line +
    }

    public static int mostCommonNames(Scanner input) {
        int uniqueNames = 0;
        while (input.hasNextLine()) {
            String prev = "";
            String next = "";
            String popularName = "";
            int popularNameCounter = 1;
            int nameCounter = 1;
            String line = input.nextLine();
            Scanner lineInput = new Scanner(line);
            while (lineInput.hasNext()) {
                next = lineInput.next();
                if (popularName.length() == 0) {
                    popularName = next;
                }
                if (!prev.equals(next)) {
                    uniqueNames++;
                    if (nameCounter > popularNameCounter) {
                        popularNameCounter = nameCounter;
                        popularName = prev;
                    }
                    nameCounter = 1;
                } else {
                    nameCounter++;
                }
                if (nameCounter > popularNameCounter) {
                    popularNameCounter = nameCounter;
                    popularName = prev;
                }
                prev = next;
            }
            System.out.println("Most common: " + popularName);
        }

        return uniqueNames;
    }
}
