package ch10.exercises;

import java.util.ArrayList;

public class Clump {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        words.add("our");
        System.out.println(words);
        clump(words);
        System.out.println(words);
    }
    public static void clump(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            String result = words.get(i) + " " + words.get(i + 1);
            words.remove(words.get(i + 1));
            words.remove(words.get(i));
            words.add(i, result);
        }
    }
}
