package ch7.exercises;

import java.util.Arrays;

public class MatrixAdd {
    public static void main(String[] args) {
//        int[][] data1 = {{0,0,0},{0,0,0}};
//        int[][] data2 = {{1,1,1},{1,1,1}};
        int[][] data1 = {};
        int[][] data2 = {};
        System.out.println(Arrays.deepToString(matrixAdd(data1, data2)));
    }
    public static int[][] matrixAdd(int[][] data1, int[][] data2) {
//        int[][] result = new int[data1.length][data1[0].length];
        int[][] result = new int[data1.length][];
        for (int i = 0; i < data1.length; i++) {
            result[i] = new int[data1[i].length];
            for (int j = 0; j < data1[i].length; j++) {
                result[i][j] = data1[i][j] + data2[i][j];
            }
        }
        return result;
    }
}
