package ch3.exercises;

public class PrintGrid {
    public static void main(String[] args) {
        printGrid(3,6);
        System.out.println();
        printGrid(5,3);
        System.out.println();
        printGrid(4,1);
        System.out.println();
        printGrid(1,3);
    }

    public static void printGrid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            int count = i;
            System.out.print(count);
            for (int j = 1; j < cols; j++) {
                System.out.print(", ");
                count = count + rows;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
