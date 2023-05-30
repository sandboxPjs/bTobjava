package ch10.exercises;

import java.util.ArrayList;

public class MinToFront {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(92);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(17);
        arrayList.add(9);
        System.out.println(arrayList);
        minToFront(arrayList);
        System.out.println(arrayList);
    }

    public static void minToFront(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == min) {
                counter++;
            }
        }
        for (int i = 0; i < counter; i++) {
            arrayList.remove(arrayList.lastIndexOf(min));
            arrayList.add(0, min);
        }
    }
}
