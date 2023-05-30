package ch10.exercises;

import java.util.ArrayList;

public class DoubleList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("how");
        arrayList.add("are");
        arrayList.add("you?");
        System.out.println(arrayList);
        doubleList(arrayList);
        System.out.println(arrayList);
    }
    public static void doubleList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i+=2) {
            arrayList.add(i, arrayList.get(i));
        }
    }
}
