package ch4.exercises;

public class Repl {
    public static void main(String[] args) {
        System.out.println(repl("hello", 3));
    }

    public static String repl(String text, int n) {
        if (n <= 0) {
            return "";
        } else {
            String sum = "";
            for (int i = 0; i < n; i++) {
                sum += text;
            }
            return sum;
        }
    }
}
