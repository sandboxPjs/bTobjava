package ch9.exercises.incrementable;

import java.util.Random;

public class RandomIncrementer implements Incrementable {
    int value;
    public RandomIncrementer() {
        this.value = getRandom();
    }

    public void increment() {
        this.value = getRandom();
    }

    public int getValue() {
        return value;
    }

    private int getRandom() {
        Random random = new Random();
        return random.nextInt();
    }
}
