package ch7.exercises;

public class IsUnique {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(isUnique(data));
    }
    public static boolean isUnique(int[] data) {
        boolean isUnique = true;
        for (int i = 0; i < data.length; i++) {
            int counter = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    counter++;
                }
            }
            if (counter >= 2) {
                isUnique = false;
            }
        }
        return isUnique;
    }
}
