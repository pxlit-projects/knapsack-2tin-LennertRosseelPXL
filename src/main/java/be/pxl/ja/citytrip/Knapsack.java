package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.Product;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Attraction> items = new ArrayList<Attraction>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        double currentWeight = 0;

        for (Attraction item: items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public void add(Attraction item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException("Het toevoegen van " + item.getName() + " overschrijdt het maximumgewicht van " + maximumCapacity + " dagen.");
        }

        items.add(item);
    }

    public List<Attraction> getItems() {
        return items;
    }
}
