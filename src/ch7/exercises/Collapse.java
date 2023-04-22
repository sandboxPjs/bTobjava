package ch7.exercises;

import java.util.Arrays;

public class Collapse {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 7};
        // ie
        // even version +
        // odd version +
        // factoring if/else --
        System.out.println(Arrays.toString(collapse(data)));
    }

    public static int[] collapse(int[] data) {
        int[] result;
        int counter = 0;
        if (data.length % 2 == 0) {
            result = new int[data.length / 2];
            for (int i = 0; i < result.length; i++) {
                result[i] = data[counter] + data[counter + 1];
                counter += 2;
            }
        } else {
            result = new int[data.length / 2 + 1];
            for (int i = 0; i < result.length - 1; i++) {
                result[i] = data[counter] + data[counter + 1];
                counter += 2;
            }
            result[result.length - 1] = data[data.length - 1];
        }
        return result;
    }
}
