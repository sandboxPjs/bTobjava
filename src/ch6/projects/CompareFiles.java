package ch6.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CompareFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File firstFile = getFile(console, 1);
        File secondFile = getFile(console, 2);
        PrintStream output = new PrintStream(new File("resources/difference report.txt"));

        int maxLength = compareFilesLength(firstFile, secondFile);
        compareFilesLines(firstFile, secondFile, output, maxLength);
    }
    // pre: number starts from 1.
    public static File getFile(Scanner console, int number) {
        System.out.printf("Enter a %d file name: ", number);
        File file = new File(console.nextLine());
        while (!file.exists()) {
            System.out.println("Not valid file name!");
            System.out.printf("Enter a %d file name: ", number);
            file = new File(console.nextLine());
        }
        return file;
    }

    public static int compareFilesLength(File firstFile, File secondFile) throws FileNotFoundException {
        int firstFileLength = getFileLength(new Scanner(firstFile));
        int secondFileLength = getFileLength(new Scanner(secondFile));
        return Math.max(firstFileLength, secondFileLength);
    }

    public static int getFileLength(Scanner input) {
        int lineCounter = 0;
        while (input.hasNextLine()) {
            lineCounter++;
            input.nextLine();
        }
        return lineCounter;
    }

    public static void compareFilesLines(File firstFile, File secondFile, PrintStream output, int maxLength)
            throws FileNotFoundException {
        output.println("Differences found:");
        for (int i = 1; i <= maxLength; i++) {
            String firstFileLine = getLine(new Scanner(firstFile), i);
            String secondFileLine = getLine(new Scanner(secondFile), i);
            if (!firstFileLine.equals(secondFileLine)) {
                output.println("Line " + i);
                output.printf("%s: %s\n", firstFile.getName(), firstFileLine);
                output.printf("%s: %s\n", secondFile.getName(), secondFileLine);
                output.println();
            }
        }
    }

    public static String getLine(Scanner input, int lineNumber) {
        String line = "";
        int lineCounter = 0;
        while (input.hasNextLine()) {
            lineCounter++;
            if (lineCounter == lineNumber) {
                return input.nextLine(); // don't read all file lines
            } else {
                input.nextLine();
            }
        }
        return line;
    }
}
