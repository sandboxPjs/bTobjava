package ch10.exercises;

import java.util.ArrayList;

public class FilterRange {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = {4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7};
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        System.out.println(arrayList);
        filterRange(arrayList, 5, 7);
        System.out.println(arrayList);
    }
    public static void filterRange(ArrayList<Integer> arrayList, int min, int max) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int number = arrayList.get(i);
            if (number >= min && number <= max) {
                arrayList.remove(i);
            }
        }
    }
}
