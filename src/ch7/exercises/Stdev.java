package ch7.exercises;

public class Stdev {
    public static void main(String[] args) {
        int[] data = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
    }
    public static double stdev(int[] data) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            counter++;
            sum += data[i];
        }
        double average = (double) sum / counter;
        double stDevaSum = 0.0;
        for (int i = 0; i < data.length; i++) {
            stDevaSum += Math.pow(data[i] - average, 2);
        }
        return Math.sqrt(stDevaSum / (data.length - 1));
    }
}
