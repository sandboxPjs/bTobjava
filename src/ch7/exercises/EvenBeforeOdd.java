package ch7.exercises;

import java.util.Arrays;

public class EvenBeforeOdd {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        evenBeforeOdd(data);
        System.out.println(Arrays.toString(data));
        // ie
        // двигаем, если число нечетное, и следующее четное +
        // еще двигать, пока не будет начало лупа или четное число
    }
    public static void evenBeforeOdd(int[] data) {
        // traverse and compare
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] % 2 != 0 && data[i + 1] % 2 == 0) {
                // movement until even number or start of loop
                int counter = 0;
                while (i + counter >= 0 && data[i + counter] % 2 != 0) {
                    int temp = data[i + counter];
                    data[i + counter] = data[i + 1 + counter];
                    data[i + 1 + counter] = temp;
                    counter--;
                }
            }
        }
    }
}
