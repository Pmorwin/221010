package dev.orwin.packageA;

public class Game {
    public int id = 10;
    protected String author = "Connor N";
    String title = "Super Mario";
    private int revenue = 1_000_000_000;

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    protected static void play(){

    }
    protected void test(){

    }
}
