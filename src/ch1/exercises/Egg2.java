package ch1.exercises;

public class Egg2 {
    public static void main(String[] args) {
        printEgg();
        printEgg();
        printEggBottom();
        printEggTop();
        printEggMiddle();
        printEggBottom();
    }

    public static void printEgg() {
        printEggTop();
        printEggBottom();
        printEggMiddle();
    }

    public static void printEggTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void printEggMiddle() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    public static void printEggBottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
