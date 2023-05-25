package ch9.exercises.incrementable;

public class SequentialIncrementer implements Incrementable {
    int value;
    public SequentialIncrementer() {
        this.value = 0;
    }

    public void increment() {
        this.value++;
    }

    public int getValue() {
        return value;
    }
}
