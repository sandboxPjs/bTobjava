package ch10.exercises;

import java.util.ArrayList;

public class MarkLength4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");
        System.out.println(words);
        markLength4(words);
        System.out.println(words);
    }
    public static void markLength4(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 4) {
                words.add(i, "****");
                i++;
            }
        }
    }
}
