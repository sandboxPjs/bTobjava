package ch10.exercises;

import java.util.ArrayList;

public class RemoveInRange {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = {0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16};
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        System.out.println(arrayList);
        removeInRange(arrayList, 0, 5, 13);
        System.out.println(arrayList);
    }
    public static void removeInRange(ArrayList<Integer> arrayList, int element, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex < 0) {
            throw new IllegalArgumentException();
        }
        if (arrayList.size() < lastIndex) {
            throw new IllegalArgumentException();
        }
        for (int i = lastIndex - 1; i >= firstIndex; i--) {
            if (arrayList.get(i) == element) {
                arrayList.remove(i);
            }
        }
    }
}
