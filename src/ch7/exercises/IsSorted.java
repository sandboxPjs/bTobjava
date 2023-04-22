package ch7.exercises;

public class IsSorted {
    public static void main(String[] args) {
        double[] data = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(data));
    }

    public static boolean isSorted(double[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i + 1] < data[i]) {
                return false;
            }
        }
        return true;
    }
}
