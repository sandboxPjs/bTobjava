package ch7.exercises;

import java.util.Arrays;

public class VowelCount {
    public static void main(String[] args) {
        String text = "i think, therefore i am";
        System.out.println(Arrays.toString(vowelCount(text)));
    }
    public static int[] vowelCount(String text) {
        int[] vowels = new int[5];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a') {
                vowels[0]++;
            } else if (c == 'e') {
                vowels[1]++;
            } else if (c == 'i') {
                vowels[2]++;
            } else if (c == 'o') {
                vowels[3]++;
            } else if (c == 'u') {
                vowels[4]++;
            }
        }
        return vowels;
    }
}
