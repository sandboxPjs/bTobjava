package ch4.exercises;

public class PrintTriangleType {
    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(12, 18, 12);
    }

    public static void printTriangleType(int one, int two, int three) {
        int counter = 0;
        if (one == two) {
            counter++;
        }
        if (two == three) {
            counter++;
        }
        if (one == three) {
            counter++;
        }

        if (counter == 0) {
            System.out.println("scalene");
        } else if (counter == 1) {
            System.out.println("isosceles");
        } else if (counter == 3) {
            System.out.println("equilateral");
        }
    }
}
