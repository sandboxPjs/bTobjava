package ch10.exercises;

import java.util.ArrayList;

public class Mirror {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        mirror(arrayList);
        System.out.println(arrayList);
    }
    public static void mirror(ArrayList<String> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(size, arrayList.get(i));
        }
    }
}
