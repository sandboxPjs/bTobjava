package ch1.exercises;

public class StarFigures {
    public static void main(String[] args) {
        showStarsBlock();
        System.out.println();
        showStarsBlock();
        showTwoLines();
        System.out.println();
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        showStarsBlock();
    }

    public static void showTwoLines() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void showFiveStars() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    public static void showStarsBlock() {
        showTwoLines();
        showFiveStars();
    }
}
