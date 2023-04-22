package ch7.exercises;

public class MinGap {
    public static void main(String[] args) {
        int[] data = {2, 4, 6};
        System.out.println(minGap(data));
    }

    public static int minGap(int[] data) {
        if (data.length < 2) {
            return 0;
        }
        int gap = data[1] - data[0];
        for (int i = 1; i < data.length - 1; i++) {
            if (data[i + 1] - data[i] < gap) {
                gap = data[i + 1] - data[i];
            }
        }
        return gap;
    }
}
