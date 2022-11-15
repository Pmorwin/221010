package dev.orwin.models;

public class Donut {

    private String name;
    private double price;
    private Jelly jelly;

    public Donut() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Jelly getJelly() {
        return jelly;
    }

    public void setJelly(Jelly jelly) {
        this.jelly = jelly;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", jelly=" + jelly +
                '}';
    }

    public Donut(String name, double price, Jelly jelly) {
        this.name = name;
        this.price = price;
        this.jelly = jelly;
    }
}
