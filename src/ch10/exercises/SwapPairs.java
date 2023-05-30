package ch10.exercises;

import java.util.ArrayList;

public class SwapPairs {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("four");
        arrayList.add("score");
        arrayList.add("and");
        arrayList.add("seven");
        arrayList.add("years");
        arrayList.add("ago");
        swapPairs(arrayList);
        System.out.println(arrayList);
        arrayList.clear();
        arrayList.add("to");
        arrayList.add("be");
        arrayList.add("or");
        arrayList.add("not");
        arrayList.add("to");
        arrayList.add("be");
        arrayList.add("hamlet");
        swapPairs(arrayList);
        System.out.println(arrayList);
    }

    public static void swapPairs(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i+=2) {
                String swap = arrayList.get(i);
                arrayList.set(i, arrayList.get(i + 1));
                arrayList.set(i + 1, swap);
        }
    }
}
