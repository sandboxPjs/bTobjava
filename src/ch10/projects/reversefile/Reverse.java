package ch10.projects.reversefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/ch10reverse.txt"));
        PrintStream output = new PrintStream("resources/ch10reverse2.txt");
        ArrayList<ArrayList<String>> data = readFile(input);
        reverseFile(data, output);
    }
    public static ArrayList<ArrayList<String>> readFile(Scanner input) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner inputLine = new Scanner(line);
            ArrayList<String> words = new ArrayList<>();
            while (inputLine.hasNext()) {
                String word = inputLine.next();
                words.add(word);
            }
            data.add(words);
        }
        return data;
    }

    public static void reverseFile(ArrayList<ArrayList<String>> data, PrintStream output) {
        for (int i = data.size() - 1; i >= 0; i--) {
            for (int j = data.get(i).size() - 1; j >= 0; j--) {
                output.print(data.get(i).get(j));
                if (j != 0) {
                    output.print(" ");
                }
            }
            if (i != 0) {
                output.print("\n");
            }
        }
    }
}
