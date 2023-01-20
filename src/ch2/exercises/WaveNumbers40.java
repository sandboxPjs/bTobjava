package ch2.exercises;

public class WaveNumbers40 {
    public static void main(String[] args) {
        // print line
        printLine();
        System.out.println();
        // print waves
        printWaves();
        System.out.println();
        // print numbers
        printNumbers();
        System.out.println();
        // print line
        printLine();
    }
    public static void printLine() {
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
    }

    public static void printWaves() {
        for (int i = 0; i < 10; i++) {
            System.out.print("_");
            System.out.print("-^-");
        }
    }

    public static void printNumbers() {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.print(j);
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(0);
            }
        }
    }
}
