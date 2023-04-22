package ch7.exercises;

public class IsMagicSquare {
    public static void main(String[] args) {
        int[][] data = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
//        int[][] data = {{2, 7, 6}, {9, 5, 1}, {40, 3, 8}};
//        int[][] data = {};
        System.out.println(isMagicSquare(data));
    }
    public static boolean isMagicSquare(int[][] data) {
        if (data.length == 0) {
            return true;
        }
        // check square if it is square in shape (same number of rows as columns, and every row the same length)
        if (data.length != data[0].length) {
            return false;
        }
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i].length != data[i + 1].length) {
                return false;
            }
        }
        // check all of its row, column, and diagonal sums are equal.
        // count row sums
        int oneSideSum = 0;
        for (int i = 0; i < 1; i++) {
            // count sum
            for (int j = 0; j < data[i].length; j++) {
                oneSideSum += data[i][j];
            }
        }
        for (int i = 1; i < data.length; i++) {
            // count sum
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            if (oneSideSum != sum) {
                return false;
            }
        }
        // count column sums
        for (int i = 0; i < data[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < data.length; j++) {
                sum += data[j][i];
            }
            if (sum != oneSideSum) {
                return false;
            }
        }
        // count diagonal sums
        // first diagonal sum
        int firstDiagonalSum = 0;
        for (int i = 0; i < data.length; i++) {
            firstDiagonalSum += data[i][i];
        }
        if (firstDiagonalSum != oneSideSum) {
            return false;
        }
        // second diagonal sum
        int secondDiagonalSum = 0;
        for (int i = 0; i < data.length; i++) {
            secondDiagonalSum += data[i][data[i].length - 1 - i];
        }
        if (secondDiagonalSum != oneSideSum) {
            return false;
        }

        return true;
    }
}
