package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Product> items = new ArrayList<Product>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        double currentWeight = 0;

        for (Product item: items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public void add(Product item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException("Het toevoegen van " + item.getName() + " overschrijdt het maximumgewicht van " + maximumCapacity + "kg.");
        }

        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
