package ch1.projects;

public class BoughtCat {
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
        System.out.println();
        verse8();
        System.out.println();
        verse9();
        System.out.println();
        verse10();
    }

    public static void verse1() {
        System.out.println("I bought me a cat");
        System.out.println("The cat pleased me");
        System.out.println("I fed my cat under yonder tree");
        commonPartCat();
        commonPartFiddle();
    }

    public static void verse2() {
        System.out.println("I bought me a hen");
        System.out.println("The hen pleased me");
        System.out.println("I fed my hen under yonder tree");
        commonPartHen();
    }

    public static void verse3() {
        System.out.println("I bought me a duck");
        System.out.println("The duck pleased me");
        System.out.println("I fed my duck under yonder tree");
        commonPartDuck();
    }

    public static void verse4() {
        System.out.println("Well I bought me a goose");
        System.out.println("The goose pleased me");
        System.out.println("I fed my goose under yonder tree");
        commonPartGoose();
    }

    public static void verse5() {
        System.out.println("Well I bought me a dog");
        System.out.println("The dog pleased me");
        System.out.println("I fed my dog under yonder tree");
        commonPartDog();
    }

    public static void verse6() {
        System.out.println("Well I bought me a sheep");
        System.out.println("The sheep pleased me");
        System.out.println("I fed my sheep under yonder tree");
        commonPartSheep();
    }

    public static void verse7() {
        System.out.println("Well I bought me a cow");
        System.out.println("The cow pleased me");
        System.out.println("I fed my cow under yonder tree");
        commonPartCow();
    }

    public static void verse8() {
        System.out.println("Well I bought me a horse");
        System.out.println("The horse pleased me");
        System.out.println("I fed my horse under yonder tree");
        commonPartHorse();
    }

    public static void verse9() {
        System.out.println("Well I bought me a baby");
        System.out.println("The baby pleased me");
        System.out.println("I fed my baby under yonder tree");
        commonPartBaby();
        commonPartFiddle();
    }

    public static void verse10() {
        System.out.println("Well I bought me a woman");
        System.out.println("The woman pleased me");
        System.out.println("I fed my woman under yonder tree");
        System.out.println("The woman cried honey honey");
        commonPartBaby();
        commonPartFiddle();
    }

    public static void commonPartCat() {
        System.out.println("The cat went fiddle I fee");
    }

    public static void commonPartHen() {
        System.out.println("The hen went chipsy chopsy");
        commonPartCat();
    }

    public static void commonPartDuck() {
        System.out.println("The duck went splishy sploshy");
        commonPartHen();
    }

    public static void commonPartGoose() {
        System.out.println("The goose went waaw waaw");
        commonPartDuck();
    }

    public static void commonPartDog() {
        System.out.println("The dog went baow baow");
        commonPartGoose();
    }

    public static void commonPartSheep() {
        System.out.println("The sheep went baah baah");
        commonPartDog();
    }

    public static void commonPartCow() {
        System.out.println("The cow went moo moo");
        commonPartSheep();
    }

    public static void commonPartHorse() {
        System.out.println("The horse went naaaaaay");
        commonPartCow();
    }

    public static void commonPartBaby() {
        System.out.println("The baby went raaa raaa");
        commonPartHorse();
    }

    public static void commonPartFiddle() {
        System.out.println("Fiddle I fee");
    }
}
