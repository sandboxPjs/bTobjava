package ch1.exercises;

public class FightSong {
    public static void main(String[] args) {
        writeGo();
        System.out.println();
        writeMainPart();
        System.out.println();
        writeMainPart();
        System.out.println();
        writeGo();
    }

    public static void writeMainPart() {
        writeGo();
        writeBest();
        writeGo();
    }

    public static void writeGo() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void writeBest() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
}
