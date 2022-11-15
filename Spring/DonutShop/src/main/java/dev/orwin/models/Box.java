package dev.orwin.models;

public class Box {

    private int value;

    public Box() {
    }

    public Box(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }

    public void setValue(int value) {
        this.value = value;
    }
}
