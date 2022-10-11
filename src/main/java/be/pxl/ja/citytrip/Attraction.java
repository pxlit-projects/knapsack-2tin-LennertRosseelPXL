package be.pxl.ja.citytrip;

import be.pxl.ja.knapsack.Item;

public class Attraction implements Item, Comparable<Attraction>{
    private int rating;
    private double days;
    private String name;

    public Attraction(String name, double days, int rating) {
        this.name = name;
        this.days = days;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return days;
    }

    public String toString() {
        return name + ", " + days + "days, " + rating + " stars";
    }

    @Override
    public int compareTo(Attraction o) {
        return Double.compare(o.rating, this.rating);
    }
}
