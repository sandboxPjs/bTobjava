package ch10.exercises;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("be");
        arrayList.add("be");
        arrayList.add("is");
        arrayList.add("not");
        arrayList.add("or");
        arrayList.add("question");
        arrayList.add("that");
        arrayList.add("the");
        arrayList.add("to");
        arrayList.add("to");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        removeDuplicates(arrayList);
        System.out.println(arrayList);
    }
    public static void removeDuplicates(ArrayList<String> arrayList) {
        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                arrayList.remove(arrayList.get(i - 1));
            }
        }
    }
}
