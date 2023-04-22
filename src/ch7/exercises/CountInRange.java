package ch7.exercises;

public class CountInRange {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(countInRange(data, 1,100));
    }

    public static int countInRange(int[] data, int min, int max) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= min && data[i] <= max) {
                counter++;
            }
        }
        return counter;
    }
}
