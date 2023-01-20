package ch1.exercises;

public class TwoRockets {
    public static void main(String[] args) {
        makeTop();
        makeBlocks();
        makeName();
        makeBlocks();
        makeTop();
    }

    public static void makeTop() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void makeBlocks() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void makeName() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
