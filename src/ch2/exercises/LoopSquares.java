package ch2.exercises;

public class LoopSquares {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
//            System.out.print(i * i + " ");
            int smthToAdd = i + i - 1;
            result += smthToAdd;
            System.out.print(result + " ");
        }
    }
}
