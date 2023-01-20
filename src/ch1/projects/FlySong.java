package ch1.projects;

public class FlySong {
    public static void main(String[] args) {
        flyVerse();
        System.out.println();
        spiderVerse();
        System.out.println();
        birdVerse();
        System.out.println();
        catVerse();
        System.out.println();
        dogVerse();
        System.out.println();
        cowVerse();
        System.out.println();
        endVerse();
    }

    public static void flyVerse() {
        System.out.println("There was an old lady who swallowed a fly");
        commonPartFly();
    }

    public static void spiderVerse() {
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wriggled and wiggled and tickled inside her");
        commonPartSpider();
    }

    public static void birdVerse() {
        System.out.println("There was an old lady who swallowed a bird");
        System.out.println("How absurd to swallow a bird");
        commonPartBird();
    }

    public static void catVerse() {
        System.out.println("There was an old lady who swallowed a cat");
        System.out.println("Fancy that to swallow a cat!");
        commonPartCat();
    }

    public static void dogVerse() {
        System.out.println("There was an old lady who swallowed a dog");
        System.out.println("What a hog to swallow a dog");
        commonPartDog();
    }

    public static void cowVerse() {
        System.out.println("There was an old lady who swallowed a cow");
        System.out.println("I don't know how she swallowed a cow");
        System.out.println("She swallowed the cow to catch the dog");
        commonPartDog();
    }

    public static void endVerse() {
        System.out.println("There was an old lady who swallowed a horse ...");
        System.out.println("She's dead, of course");
    }

    public static void commonPartFly() {
        System.out.println("I don't know why she swallowed a fly.");
        System.out.println("Perhaps she'll die!");
    }

    public static void commonPartSpider() {
        System.out.println("She swallowed the spider to catch the fly");
        commonPartFly();
    }

    public static void commonPartBird() {
        System.out.println("She swallowed the bird to catch the spider");
        commonPartSpider();
    }

    public static void commonPartCat() {
        System.out.println("She swallowed the cat to catch the bird");
        commonPartBird();
    }

    public static void commonPartDog() {
        System.out.println("She swallowed the cat to catch the bird");
        commonPartBird();
    }
}
