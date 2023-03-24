package ch5.exercises;

public class CharsSorted {
    public static void main(String[] args) {
        System.out.println(charsSorted("abcde"));
        System.out.println(charsSorted("beads"));
    }

    public static boolean charsSorted(String text) {
        // while next - prev == 1
        // flag == true
        boolean charsSorted = true;
        for (int i = 0; i < text.length() - 1; i++) {
            char prev = text.charAt(i);
            char next = text.charAt(i + 1);
            if (next <= prev) {
                charsSorted = false;
            }
        }

        return charsSorted;
    }
}
