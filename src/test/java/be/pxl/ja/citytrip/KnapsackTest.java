package be.pxl.ja.citytrip;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.*;

public class KnapsackTest {
    @Test
    public void testGetCurrentWeight() throws KnapsackFullException {
        // act
        Knapsack knapsack = new Knapsack(50);

        // arrange
        try {
            knapsack.add(new Attraction("Attraction 1", 60, 35));
        } catch (be.pxl.ja.citytrip.KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Attraction("Attration 2", 5, 40));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Attraction("Attraction 3", 15, 20));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        // assert
        assertEquals(20, knapsack.getCurrentWeight());
    }

    @Test
    public void testAdd() throws KnapsackFullException {
        // act
        Knapsack knapsack = new Knapsack(50);

        // arrange
        try {
            knapsack.add(new Attraction("Attraction 1", 60, 35));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Attraction("Attraction 2", 5, 40));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Attraction("Attraction 3", 15, 20));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        // assert
        assertEquals(2, knapsack.getItems().size());
    }
}
