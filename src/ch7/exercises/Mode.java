package ch7.exercises;

public class Mode {
    public static void main(String[] args) {
        int[] data = {74, 85, 10, 99, 11, 85, 56};
        System.out.println(mode(data));
    }

    public static int mode(int[] data) {
        // count data
        int[] counter = new int[101];
        for (int i = 0; i < data.length; i++) {
            counter[data[i]]++;
        }
        // find max
        int max = counter[0];
        int maxIndex = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
