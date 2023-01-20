package ch1.exercises;

public class Shining {
    public static void main(String[] args) {
        loop10();
    }

    // 2
    public static void loop1() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    // 3
    public static void loop2() {
        loop1();
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    // 7
    public static void loop3() {
        loop2();
        loop2();
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    // 15
    public static void loop4() {
        loop3();
        loop3();
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    // 31
    public static void loop5() {
        loop4();
        loop4();
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    // 62
    public static void loop6() {
        loop5();
        loop5();
    }

    // 125
    public static void loop7() {
        loop6();
        loop6();
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    // 250
    public static void loop8() {
        loop7();
        loop7();
    }

    // 500
    public static void loop9() {
        loop8();
        loop8();
    }

    // 1000
    public static void loop10() {
        loop9();
        loop9();
    }
}
