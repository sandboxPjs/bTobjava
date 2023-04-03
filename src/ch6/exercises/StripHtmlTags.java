package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StripHtmlTags {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/web.html"));
        stripHtmlTags(input);
    }

    public static void stripHtmlTags(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner l = new Scanner(line);
            while (l.hasNext()) {
                String token = l.next();

                if (token.contains("<")) { // <title>My; now:<img
                    if (token.contains(">")) {
                        if (token.indexOf("<") == 0) {
                            token = token.substring(token.indexOf(">") + 1);
                        } else {
                            token = token.substring(0, token.indexOf("<"));
                        }
                    } else {
                        if (token.indexOf("<") == 0) {
                            token = "";
                        } else {
                            token = token.substring(0, token.indexOf("<"));
                        }
                    }
                } else if (token.contains(">")) { // src="cat.jpg">; color="red">awesome
                    if (token.indexOf(">") == token.length() - 1) {
                        token = "";
                    } else {
                        token = token.substring(token.indexOf(">") + 1);
                    }
                }
                if (token.length() == 0) {
                    System.out.print(token);
                } else {
                    System.out.print(token);
                    if (l.hasNext()) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
