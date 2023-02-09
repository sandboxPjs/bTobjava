package ch3.exercises;

import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String line = scanner.nextLine();
        int index = line.indexOf(" ");
        String name = line.substring(0, index);
        String surname = line.substring(index + 1);
        printSong(name);
        System.out.println();
        printSong(surname);
    }

    public static void printSong(String data) {
        System.out.println(data + " " + data + ", bo-B" + data.substring(1));
        System.out.println("Banana-fana fo-F" + data.substring(1));
        System.out.println("Fee-fi-mo-M" + data.substring(1));
        System.out.println(data.toUpperCase() + "!");
    }
}
