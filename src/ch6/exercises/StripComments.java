package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StripComments {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/code.java"));
        stripComments(input);
    }

    public static void stripComments(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.contains("/*") && !line.contains("*/")) {
                while(!line.contains("*/")) {
                    line = input.nextLine();
                }
                line = "";
            }
            if (line.contains("//")) {
                line = line.substring(0, line.indexOf("//"));
            } else if (line.contains("/*") && line.contains("*/")) {
                line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
            }
            System.out.println(line);
        }
    }
}
