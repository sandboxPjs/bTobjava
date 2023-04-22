package ch7.exercises;

public class PercentEven {
    public static void main(String[] args) {
        int[] data = {74, 85, 10, 99, 11, 85, 56};
        System.out.println(percentEven(data));
    }

    public static double percentEven(int[] data) {
        if (data.length == 0) {
            return 0.0;
        }
        int evenCounter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenCounter++;
            }
        }
        return evenCounter * 100.0 / data.length;
    }
}
