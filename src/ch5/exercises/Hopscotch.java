package ch5.exercises;

public class Hopscotch {
    public static void main(String[] args) {
        // this is fencepost because 1s start and 2s are between
        hopscotch(10);
        // обработка по-разному для двуразрядного и одноразрядного чисел
        // добавить факторинг для разных веток с разрядами
    }

    public static void hopscotch(int hops) {
        // calculate total number
        int total = hops * 3 + 1;

        // format and print numbers
        System.out.printf("%3s", " ");
        System.out.printf("%-3d\n", 1);
        for (int i = 2; i <= total; i++) {
            System.out.printf("%-4d", i);
            i++;
            if (i / 10 == 0) { // 1 digit
                System.out.printf("%3d\n", i);
            } else if (i / 10 > 0) { // 2 digit
                System.out.printf("%5d\n", i);
            }
            i++;
            System.out.printf("%3s", " ");
            System.out.printf("%-1d\n", i);
        }
    }
}
