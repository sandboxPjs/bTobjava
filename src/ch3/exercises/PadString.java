package ch3.exercises;

public class PadString {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(padString("hello", 8));
        System.out.println(padString("congratulations", 10));
    }

    public static String padString(String data, int length) {
        String result = data;
        for (int i = 0; i < length - data.length(); i++) {
            result = " " + result;
        }

        return result;
    }
}
