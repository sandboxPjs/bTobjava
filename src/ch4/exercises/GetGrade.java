package ch4.exercises;

public class GetGrade {
    public static void main(String[] args) {
        System.out.println(getGrade(50));
        System.out.println(getGrade(60));
        System.out.println(getGrade(61));
        System.out.println(getGrade(62));
        System.out.println(getGrade(63));
        System.out.println(getGrade(95));
    }

    public static double getGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException();
        }
        double grade;

        if (score < 60) {
             grade = 0.0;
        } else if (score >= 60 && score <= 62) {
            grade = 0.7;
        } else if (score > 62 && score < 95) {
            double calculation = 0.7 + (score - 62) * 0.1;
            grade = Math.round(calculation * 10) / 10.0;
        } else { // score >= 95
            grade = 4.0;
        }

        return grade;
    }
}
