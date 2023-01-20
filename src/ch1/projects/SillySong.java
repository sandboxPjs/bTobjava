package ch1.projects;

public class SillySong {
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
    }

    public static void verse1() {
        System.out.println("I once wrote a program that wouldn't compile");
        commonPartCompile();
    }

    public static void verse2() {
        System.out.println("My program did nothing");
        System.out.println("So I started typing.");
        commonPartPrint();
    }

    public static void verse3() {
        System.out.println("\"Parse error,\" cried the compiler");
        System.out.println("Luckily I'm such a code baller.");
        commonPartBackslash();
    }

    public static void verse4() {
        System.out.println("Now the compiler wanted an identifier");
        System.out.println("And I thought the situation was getting dire.");
        commonPartMain();
    }

    public static void verse5() {
        System.out.println("Java complained it expected an enum");
        System.out.println("Boy, these computers really are dumb!");
        System.out.println("I added a public class and called it Scum,");
        commonPartMain();
    }

    public static void commonPartTa() {
        System.out.println("My TA just smiled.");
    }

    public static void commonPartCompile() {
        System.out.println("I don't know why it wouldn't compile,");
        commonPartTa();
    }

    public static void commonPartPrint() {
        System.out.println("I added System.out.println(\"I <3 coding\"),");
        commonPartCompile();
    }


    public static void commonPartBackslash() {
        System.out.println("I added a backslash to escape the quotes,");
        commonPartPrint();
    }

    public static void commonPartMain() {
        System.out.println("I added a main method with its String[] args,");
        commonPartBackslash();
    }
}
