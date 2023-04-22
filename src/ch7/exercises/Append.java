package ch7.exercises;

import java.util.Arrays;

public class Append {
    public static void main(String[] args) {
        int[] a1 = {74, 85, 102, 99};
        int[] a2 = {101, 85, 56};
        System.out.println(Arrays.toString(append(a1, a2)));
    }
    public static int[] append(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[i + a1.length] = a2[i];
        }
        return result;
    }
}
