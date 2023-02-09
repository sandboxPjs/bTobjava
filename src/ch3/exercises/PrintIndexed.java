package ch3.exercises;

public class PrintIndexed {
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }

    public static void printIndexed(String data) {
        int count = 0;
        for (int i = data.length() - 1; i >= 0; i--) {
            System.out.print(data.charAt(count));
            System.out.print(i);
            count++;
        }
    }
}
