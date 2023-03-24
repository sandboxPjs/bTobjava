package ch5.exercises;

public class MonthApart {
    public static void main(String[] args) {
        System.out.println(monthApart(2, 14, 3, 15));
        System.out.println(monthApart(4, 5, 5, 15));
        System.out.println(monthApart(4, 15, 5, 15));// !
        System.out.println(monthApart(4, 16, 5, 15));
        System.out.println(monthApart(6, 14, 6, 8));
        System.out.println(monthApart(7, 7, 6, 8));
        System.out.println(monthApart(7, 8, 6, 8)); // !
        System.out.println(monthApart(10, 14, 7, 15));
    }

    public static boolean monthApart(int monthOne, int dayOne, int monthTwo, int dayTwo) {
        // transform date in a number
        // make comparison

        // transform date in a number
        int first = calculateDays(monthOne) + dayOne;
        int second = calculateDays(monthTwo) + dayTwo;

        // make comparison
        int difference = Math.abs(first - second);

        // check difference
        int minMonthLength = daysInMonth(Math.min(monthOne, monthTwo));
        if (minMonthLength == 28) {
            return  difference >= 28;
        } else if (minMonthLength == 30) {
            return  difference >= 30;
        } else {
            return  difference >= 31;
        }
    }

    public static int calculateDays(int month) {
        int sum = 0;
        for (int i = 1; i <= month - 1; i++) { // ended months only
            sum += daysInMonth(i);
        }
        return sum;
    }

    public static int daysInMonth(int month) {
        if (month == 1) {
            return 31;
        } else if (month == 2) {
            return 28;
        } else if (month == 3) {
            return 31;
        } else if (month == 4) {
            return 30;
        } else if (month == 5) {
            return 31;
        } else if (month == 6) {
            return 30;
        } else if (month == 7) {
            return 31;
        } else if (month == 8) {
            return 31;
        } else if (month == 9) {
            return 30;
        } else if (month == 10) {
            return 31;
        } else if (month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
