package ch4.exercises;

public class PrintAcronym {
    public static void main(String[] args) {
        printAcronym("Breath of the Wild");
    }

    public static void printAcronym(String text) {
        String acronym = "";
        boolean wordFlag = true;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i)) && wordFlag) {
                wordFlag = false;
                acronym += text.charAt(i);
            } else if (Character.isWhitespace(text.charAt(i))) {
                wordFlag = true;
            }
        }

        System.out.println(acronym);
    }
}
