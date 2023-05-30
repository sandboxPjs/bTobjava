package ch10.exercises;

import java.util.ArrayList;

public class RemoveZeroe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(4);
        arrayList.add(0);
        System.out.println(arrayList);
        removeZeroe(arrayList);
        System.out.println(arrayList);
    }
    public static void removeZeroe(ArrayList<Integer> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) == 0) {
                arrayList.remove(arrayList.get(i));
            }
        }
    }
}
