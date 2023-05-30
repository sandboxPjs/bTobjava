package ch10.exercises;

import java.util.ArrayList;

public class ScaleByK {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(3);
        System.out.println(arrayList);
        scaleByK(arrayList);
        System.out.println(arrayList);
    }

    public static void scaleByK(ArrayList<Integer> arrayList) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i+=counter) {
            counter = arrayList.get(i);
            if (counter <= 0) {
                arrayList.remove(i);
            }
            for (int j = 0; j < counter - 1; j++) {
                arrayList.add(i, counter);
            }
        }
    }
}
