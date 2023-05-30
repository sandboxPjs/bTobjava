package ch10.exercises;

import java.util.ArrayList;

public class RangeBetweenZeroe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(9);
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(8);
        System.out.println(rangeBetweenZeroe(arrayList));

    }
    public static int rangeBetweenZeroe(ArrayList<Integer> arrayList) {
        int minIndex = arrayList.indexOf(0);
        int maxIndex = arrayList.lastIndexOf(0);
        if (minIndex == - 1) {
            return 0;
        } else if (minIndex == maxIndex){
            return 1;
        } else {
            return maxIndex - minIndex + 1;
        }
    }
}
