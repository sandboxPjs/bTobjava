package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEntireFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        System.out.println(readEntireFile(input));
    }

    public static String readEntireFile(Scanner input) {
        String text = "";
        while(input.hasNextLine()) {
            text += input.nextLine() + "\n";
        }

        return text;
    }
}
