package ch10.exercises;

import java.util.ArrayList;

public class Stutter {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("how");
        arrayList.add("are");
        arrayList.add("you?");
        System.out.println(arrayList);
        stutter(arrayList, 4);
        System.out.println(arrayList);
    }
    public static void stutter(ArrayList<String> arrayList, int k) {
        if (k <= 0) {
            arrayList.clear();
        } else {
            for (int i = 0; i < arrayList.size(); i+=k) {
                for (int j = 0; j < k - 1; j++) {
                    arrayList.add(i, arrayList.get(i));
                }
            }
        }
    }
}
