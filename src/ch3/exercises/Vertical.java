package ch3.exercises;

public class Vertical {
    public static void main(String[] args) {
        vertical("hey now");
    }

    public static void vertical(String data) {
        for (int i = 0; i < data.length(); i++) {
            System.out.println(data.charAt(i));
        }
    }
}
