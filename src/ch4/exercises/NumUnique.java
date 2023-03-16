package ch4.exercises;

public class NumUnique {
    public static void main(String[] args) {
        System.out.println(numUnique(18, 3, 4));
        System.out.println(numUnique(6, 7, 6));
        System.out.println(numUnique(6, 6, 6));
    }
    public static int numUnique(int one, int two, int three) {
        int count = 0;

        if (one != two) {
            count++;
        }

        if (one != three) {
            count++;
        }

        if (two != three) {
            count++;
        }

        if (one == two && one == three) {
            count++;
        }

        return count;
    }
}
