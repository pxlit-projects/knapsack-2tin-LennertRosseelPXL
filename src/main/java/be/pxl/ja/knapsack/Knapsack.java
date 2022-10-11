package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<I extends Item> {
    private double maximumCapacity;
    private List<I> items = new ArrayList<>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        double currentWeight = 0;

        for (I item: items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public void add(I item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException("Het toevoegen van " + item + " overschrijdt het maximumgewicht van " + maximumCapacity + "kg.");
        }

        items.add(item);
    }

    public List<I> getItems() {
        return items;
    }
}
