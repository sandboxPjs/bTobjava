package ch10.exercises;

import java.util.ArrayList;

public class RemoveShorterStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        words.add("one");
        System.out.println(words);
        removeShorterStrings(words);
        System.out.println(words);
    }
    public static void removeShorterStrings(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            String first = words.get(i);
            String second = words.get(i + 1);
            if (first.length() > second.length()) {
                words.remove(i + 1);
            } else if(first.length() < second.length()) {
                words.remove(i);
            } else {
                words.remove(i);
            }
        }
    }
}
