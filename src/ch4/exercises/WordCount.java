package ch4.exercises;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Words number: " + wordCount("hello"));
        System.out.println("Words number: " + wordCount("how are you?"));
        System.out.println("Words number: " + wordCount(" this     string has     wide       spaces "));
        System.out.println("Words number: " + wordCount(" "));
    }

    public static int wordCount(String text) {
        int counter = 0;
        boolean wordFlag = true;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i)) && wordFlag) {
                counter++;
                wordFlag = false;
            } else if (Character.isWhitespace(text.charAt(i))) {
                wordFlag = true;
            }
        }

        return counter;
    }
}
