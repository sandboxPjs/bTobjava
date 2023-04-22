package ch7.exercises;

public class LongestSortedSequence {
    public static void main(String[] args) {
        int[] data = {2, 4, 6};
        System.out.println(longestSortedSequence(data));
    }

    public static int longestSortedSequence(int[] data) {
        if (data.length == 0) {
            return 0;
        }

        int counter = 1;
        int maxCounter = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i + 1] >= data[i]) {
                counter++;
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
                counter = 1;
            }
        }
        if (counter > maxCounter) {
            maxCounter = counter;
        }
        return maxCounter;
    }
}
