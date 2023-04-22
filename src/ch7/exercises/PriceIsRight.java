package ch7.exercises;

public class PriceIsRight {
    public static void main(String[] args) {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        int price = 100;
        System.out.println(priceIsRight(data, price));
    }

    public static int priceIsRight(int[] bids, int price) {
        int closestValue = 0;
        for (int i = 0; i < bids.length; i++) {
            if (bids[i] <= price && bids[i] > closestValue) {
                closestValue = bids[i];
            }
        }
        if (closestValue > 0) {
            return closestValue;
        } else {
            return -1;
        }
    }
}
