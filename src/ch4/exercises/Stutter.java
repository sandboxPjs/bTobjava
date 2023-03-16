package ch4.exercises;

public class Stutter {
    public static void main(String[] args) {
        System.out.println(stutter("Hello!"));
    }

    public static String stutter(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char first = word.charAt(i);
            result += first;
            result += first;
        }

        return result;
    }
}
