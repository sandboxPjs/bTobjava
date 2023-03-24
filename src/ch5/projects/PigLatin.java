package ch5.projects;

import java.util.Scanner;


public class PigLatin {
    public static void main(String[] args) {
        // check assertion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print your line: ");
        String line = scanner.nextLine();
        boolean isFilledLine = isLineFilled(line);
        while (isFilledLine) {
            System.out.println("Result line: " + convertLine(line));
            System.out.print("Print your line: ");
            line = scanner.nextLine();
            isFilledLine = isLineFilled(line);
        }
    }
    public static String convertLine(String line) {
        String resultLine = "";
        String word = "";
        char letter = 0;
        for (int i = 0; i < line.length(); i++) {
            letter = line.charAt(i);
            if (!Character.isWhitespace(letter)) {
                word += letter;
            } else { // word finished
                resultLine += convertWord(word);
                resultLine += " ";
                word = "";
            }
        }
        if (word.length() > 0) {
            resultLine += convertWord(word);
        }

        return resultLine;
    }

    // to convert word to pig latin
    public static String convertWord(String word) {
        // get all consonant letters before first vowel

        char first = word.charAt(0);
        if (isConsonant(first)) { // y is here
            int counter = 0;
            char letter = 0;
            do {
                letter = word.charAt(counter);
                counter++;
            } while (isConsonant(letter));
            word = word.substring(counter - 1) + "-" + word.substring(0, counter - 1) + "ay";
        } else {
            word = word + "-" + "ay";
        }
        return word;
    }

    // to check is printed line empty or filled.
    public static boolean isLineFilled(String line) {
        return !line.isEmpty() && !Character.isWhitespace(line.charAt(0));
    }

    // to check is letter consonant.
    // Consonant letters: https://usefulenglish.ru/phonetics/english-consonant-sounds
    // 1. letters: b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, z
    // 2. y + vowels in stars: ya, ye, yi, yo, yu
    // Consonant combinations
    // 3. usual: ch, tch, gh, gu, ph, qu, sc, sch, sh, th, wh, pt, kn, gn, pn, ps, rh, wr
    // 4. rare/acronyms/slang: cc, ck, dge, ng, xh, bt, mb, lm
    public static boolean isConsonant(char letter) {
        return letter != 'a' && letter != 'A' && letter != 'e' && letter != 'E' && letter != 'i' && letter != 'I'
                && letter != 'o' && letter != 'O' && letter != 'u' && letter != 'U';
    }
}
