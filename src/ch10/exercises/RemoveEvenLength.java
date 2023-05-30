package ch10.exercises;

import java.util.ArrayList;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("is");
        arrayList.add("one");
        arrayList.add("is");
        arrayList.add("is");
        arrayList.add("one");
        System.out.println(arrayList);
        removeEvenLength(arrayList);
        System.out.println(arrayList);
    }

    public static void removeEvenLength(ArrayList<String> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if(arrayList.get(i).length() % 2 == 0) {
                arrayList.remove(arrayList.get(i));
            }
        }
    }
}
