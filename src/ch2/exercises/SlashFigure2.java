package ch2.exercises;

public class SlashFigure2 {
    public static final int HEIGHT = 7;

    public static void main(String[] args) {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < (-4 * i + (4 * HEIGHT + 2)); j++) {
                System.out.print("!");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
