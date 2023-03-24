package ch5.exercises;

public class AnglePairs {
    public static void main(String[] args) {
        System.out.println(anglePairs(0, 90, 180));
        System.out.println(anglePairs(180, 45, 45));
    }

    public static boolean anglePairs(int one, int two, int three) {
        boolean complementary = false;
        boolean supplementary = false;

        if (one + two == 90) {
            complementary = true;
        } else if (one + three == 90) {
            complementary = true;
        } else if (two + three == 90) {
            complementary = true;
        }

        if (one + two == 180) {
            supplementary = true;
        } else if (one + three == 180) {
            supplementary = true;
        } else if (two + three == 180) {
            supplementary = true;
        }

        return complementary && supplementary;
    }
}
