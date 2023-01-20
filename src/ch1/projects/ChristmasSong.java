package ch1.projects;

public class ChristmasSong {
    public static void main(String[] args) {
        firstDay();
        System.out.println();
        secondDay();
        System.out.println();
        thirdDay();
        System.out.println();
        fourthDay();
        System.out.println();
        fifthDay();
        System.out.println();
        sixthDay();
        System.out.println();
        seventhDay();
        System.out.println();
        eighthDay();
        System.out.println();
        ninthDay();
        System.out.println();
        tenthDay();
        System.out.println();
        eleventhDay();
        System.out.println();
        twelfthDay();
    }

    public static void firstDay() {
        System.out.println("On the first day of Christmas,");
        commonPartLove();
        commonPartTree();
    }

    public static void secondDay() {
        System.out.println("On the second day of Christmas,");
        commonPartLove();
        commonPartTurtleDoves();
    }

    public static void thirdDay() {
        System.out.println("On the third day of Christmas,");
        commonPartLove();
        commonPartFrenchHens();
    }

    public static void fourthDay() {
        System.out.println("On the fourth day of Christmas,");
        commonPartLove();
        commonPartBirds();
    }

    public static void fifthDay() {
        System.out.println("On the fifth day of Christmas,");
        commonPartLove();
        commonPartRings();
    }

    public static void sixthDay() {
        System.out.println("On the sixth day of Christmas,");
        commonPartLove();
        commonPartGeese();
    }

    public static void seventhDay() {
        System.out.println("On the seventh day of Christmas,");
        commonPartLove();
        commonPartSwans();
    }

    public static void eighthDay() {
        System.out.println("On the eighth day of Christmas,");
        commonPartLove();
        commonPartMaids();
    }

    public static void ninthDay() {
        System.out.println("On the ninth day of Christmas,");
        commonPartLove();
        commonPartLadies();
    }

    public static void tenthDay() {
        System.out.println("On the tenth day of Christmas,");
        commonPartLove();
        commonPartLords();
    }

    public static void eleventhDay() {
        System.out.println("On the eleventh day of Christmas,");
        commonPartLove();
        commonPartPipers();
    }

    public static void twelfthDay() {
        System.out.println("On the twelfth day of Christmas,");
        commonPartLove();
        System.out.println("Twelve drummers drumming,");
        commonPartPipers();
    }

    public static void commonPartLove() {
        System.out.println("my true love sent to me");
    }

    public static void commonPartTree() {
        System.out.println("A partridge in a pear tree.");
    }

    public static void commonPartTurtleDoves() {
        System.out.println("Two turtle doves,");
        commonPartTree();
    }

    public static void commonPartFrenchHens() {
        System.out.println("Three French hens,");
        commonPartTurtleDoves();
    }

    public static void commonPartBirds() {
        System.out.println("Four calling birds");
        commonPartFrenchHens();
    }

    public static void commonPartRings() {
        System.out.println("Five golden rings,");
        commonPartBirds();
    }

    public static void commonPartGeese() {
        System.out.println("Six geese a-laying,");
        commonPartRings();
    }

    public static void commonPartSwans() {
        System.out.println("Seven swans a-swimming,");
        commonPartGeese();
    }

    public static void commonPartMaids() {
        System.out.println("Eight maids a-milking,");
        commonPartSwans();
    }

    public static void commonPartLadies() {
        System.out.println("Nine ladies dancing,");
        commonPartMaids();
    }

    public static void commonPartLords() {
        System.out.println("Ten lords a-leaping,");
        commonPartLadies();
    }

    public static void commonPartPipers() {
        System.out.println("Eleven pipers piping,");
        commonPartLords();
    }
}
