package ch10.exercises;

import java.util.ArrayList;

public class Interleave {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        int[] array1 = {10, 20, 30};
        for (int i = 0; i < array1.length; i++) {
            first.add(array1[i]);
        }
        ArrayList<Integer> second = new ArrayList<>();
        int[] array2 = {4, 5, 6, 7, 8};
        for (int i = 0; i < array2.length; i++) {
            second.add(array2[i]);
        }
        System.out.println(first);
        interleave(first, second);
        System.out.println(first);
    }
    public static void interleave(ArrayList<Integer> first, ArrayList<Integer> second) {
        if (first.size() == 0) {
            for (int i = 0; i < second.size(); i++) {
                first.add(second.get(i));
            }
        } else {
            if (first.size() <= second.size()) {
                int firstSize = first.size();
                for (int i = firstSize - 1; i >= 0; i--) {
                    first.add(i + 1, second.get(i));
                }
                for (int i = firstSize; i < second.size(); i++) {
                    first.add(second.get(i));
                }
            } else {
                for (int i = second.size() - 1; i >= 0; i--) {
                    first.add(i + 1, second.get(i));
                }
            }
        }
    }
}
