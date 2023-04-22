package ch7.exercises;

import java.util.Arrays;

public class Contains {
    public static void main(String[] args) {
        int[] a1 = {8, 8, 8, 8, 4, 8, 8, 8, 8, 2, 8};
        int[] a2 = {8, 8, 8, 8, 8};
        System.out.println(contains(a1, a2));
    }

    public static boolean contains(int[] a1, int[] a2) {
        if (a2.length > a1.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1.length - i >= a2.length) {
                int counter = 0;
                boolean isEqual = true;
                while (isEqual && counter <= a2.length - 1) {
                    // iterate through all a2
                    if (a1[i + counter] != a2[counter]) {
                        isEqual = false;
                    }
                    counter++;
                }
                if (isEqual) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
