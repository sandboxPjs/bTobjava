package ch10.exercises;

import java.util.ArrayList;

public class Reverse3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(19);
        arrayList.add(42);
        arrayList.add(7);
        arrayList.add(26);
        arrayList.add(19);
        arrayList.add(-8);
        System.out.println(arrayList);
        reverse3(arrayList);
        System.out.println(arrayList);
    }

    public static void reverse3(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 2; i+=3) {
            int swap = arrayList.get(i);
            arrayList.set(i, arrayList.get(i + 2));
            arrayList.set(i + 2, swap);
        }
    }
}
