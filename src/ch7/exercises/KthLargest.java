package ch7.exercises;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(kthLargest(2, data));
    }
    public static int kthLargest(int k, int[] a) {
        Arrays.sort(a);
        return a[a.length - 1 - k];
    }
}
