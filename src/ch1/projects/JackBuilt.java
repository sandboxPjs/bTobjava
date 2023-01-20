package ch1.projects;

public class JackBuilt {
    public static void main(String[] args) {
        verse1();
        System.out.println();
        verse2();
        System.out.println();
        verse3();
        System.out.println();
        verse4();
        System.out.println();
        verse5();
        System.out.println();
        verse6();
        System.out.println();
        verse7();
    }

    public static void verse1() {
        System.out.println("This is the house that Jack built.");
    }

    public static void verse2() {
        System.out.println("This is the malt");
        commonPartJack();
    }

    public static void verse3() {
        System.out.println("This is the rat,");
        System.out.println("That ate the malt");
        commonPartJack();
    }

    public static void verse4() {
        System.out.println("This is the cat,");
        commonPartRat();
    }

    public static void verse5() {
        System.out.println("This is the dog,");
        commonPartCat();
    }

    public static void verse6() {
        System.out.println("This is the cow with the crumpled horn,");
        commonPartDog();
    }

    public static void verse7() {
        System.out.println("This is the maiden all forlorn");
        System.out.println("That milked the cow with the crumpled horn,");
        commonPartDog();
    }

    public static void commonPartJack() {
        System.out.println("That lay in the house that Jack built.");
    }

    public static void commonPartMalt() {
        System.out.println("That ate the malt");
        commonPartJack();
    }

    public static void commonPartRat() {
        System.out.println("That killed the rat,");
        commonPartMalt();
    }

    public static void commonPartCat() {
        System.out.println("That worried the cat,");
        commonPartRat();
    }

    public static void commonPartDog() {
        System.out.println("That tossed the dog,");
        commonPartCat();
    }
}
