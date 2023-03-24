package ch5.exercises;

public class IsAllVowels {
    public static void main(String[] args) {
        System.out.println(isAllVowels("eIEiO"));
        System.out.println(isAllVowels("oink")	);
    }

    public static boolean isAllVowels(String text) {
        boolean isAllVowels = true;

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a != 'a' && a != 'A' && a != 'e' && a != 'E' && a != 'i' && a != 'I' && a != 'o' && a != 'O' && a != 'u' && a != 'U') {
                isAllVowels = false;
            }
        }

        return isAllVowels;
    }
}
