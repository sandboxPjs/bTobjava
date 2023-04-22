package ch7.exercises;

public class Range {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(range(data));
    }

    public static int range(int[] data) {
        int min = data[0];
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max - min + 1;
    }
}
