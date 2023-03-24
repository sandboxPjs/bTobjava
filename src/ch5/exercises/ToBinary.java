package ch5.exercises;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(42));
        System.out.println(toBinary(0));
    }

    public static String toBinary(int number) {
        String text = "";
        // add until number / 2 = 1
        text += number % 2;
        while (number / 2 != 0) {
            number = number / 2;
            text += number % 2;
        }
        // create the result binary digit (1 + reverse String)
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }
}
