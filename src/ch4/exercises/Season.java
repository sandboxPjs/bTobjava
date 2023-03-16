package ch4.exercises;

public class Season {
    public static void main(String[] args) {
        System.out.println(season(1, 5));
    }

    public static String season(int month, int day) {
        String season = "";
        int date = (month - 1) * 31 + day;

        if (date >= 357 && date <= 372 || date >= 0 && date <= 77) {
            season = "Winter";
        } else if (date >= 78 && date <= 170) {
            season = "Spring";
        } else if (date >= 171 && date <= 263) {
            season = "Summer";
        } else if (date >= 264 && date <= 356) {
            season = "Fall";
        }

        return season;
    }
}
