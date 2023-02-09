package ch3.exercises;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processName(scanner);
    }
    public static void processName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String line = scanner.nextLine();
        int index = line.indexOf(" ");
        String name = line.substring(0, index);
        String surname = line.substring(index);
        System.out.println("Your name in reverse order is" + surname + ", " + name);
    }
}
