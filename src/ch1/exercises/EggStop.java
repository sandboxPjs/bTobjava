package ch1.exercises;

public class EggStop {
    public static void main(String[] args) {
        printEgg();
        System.out.println();
        printEgg();
        System.out.println("+--------+");
        System.out.println();
        printEggTop();
        System.out.println("|  STOP  |");
        printEggBottom();
        System.out.println("+--------+");
    }

    public static void printEgg() {
        printEggTop();
        printEggBottom();
    }

    public static void printEggTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void printEggBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
}
