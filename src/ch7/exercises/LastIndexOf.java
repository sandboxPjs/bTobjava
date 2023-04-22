package ch7.exercises;

public class LastIndexOf {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(lastIndexOf(data, 85));
    }

    public static int lastIndexOf(int[] data, int value) {
        int index = -1;
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == value) {
                return i;
            }
        }
        return index;
    }
}
