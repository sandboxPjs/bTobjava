package ch7.exercises;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] data = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println(median(data));
    }
    public static int median(int[] data) {
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        return data[data.length / 2];
    }
}
