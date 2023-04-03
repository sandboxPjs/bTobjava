package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        printDuplicates(input);
    }

    public static void printDuplicates(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String prev = "";
            String next = "";
            int counter = 1;
            Scanner l = new Scanner(line);
            while (l.hasNext()) {
                next = l.next();
                if (prev.equals(next)) {
                    counter++;
                } else {
                    if (counter >= 2) {
                        System.out.print(prev);
                        System.out.print("*");
                        System.out.print(counter);
                        if (l.hasNext()) {
                            System.out.print(" ");
                        }
                        counter = 1;
                    }
                    prev = next;
                }
            }
            if (counter >= 2) {
                System.out.print(prev);
                System.out.print("*");
                System.out.print(counter);
            }
            System.out.println();
        }
    }
}
