package ch10.exercises;

import java.util.ArrayList;

public class AverageVowels {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("is");
        words.add("is");
        words.add("is");
        words.add("is");
        System.out.println(averageVowels(words));
    }
    public static double averageVowels(ArrayList<String> words) {
        int vowels = 0;
        int symbols = 0;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                    vowels++;
                }
                symbols++;
            }
        }
        return 100.0 * vowels / symbols;
    }
}
