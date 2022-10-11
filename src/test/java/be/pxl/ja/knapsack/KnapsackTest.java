package be.pxl.ja.knapsack;

import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KnapsackTest {
    @Test
    public void testGetCurrentWeight() throws KnapsackFullException {
        // act
        Knapsack<Product> knapsack = new Knapsack<Product>(50);

        // arrange
        try {
            knapsack.add(new Product("Product 3", 60, 35));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Product("Product 1", 5, 40));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Product("Product 2", 15, 20));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }


        // assert
        assertEquals(20, knapsack.getCurrentWeight());
    }

    @Test
    public void testAdd() throws KnapsackFullException {
        // act
        Knapsack<Product> knapsack = new Knapsack<Product>(50);

        // arrange
        try {
            knapsack.add(new Product("Product 3", 60, 35));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Product("Product 1", 5, 40));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            knapsack.add(new Product("Product 2", 15, 20));
        } catch (KnapsackFullException e) {
            System.out.println(e.getMessage());
        }


        // assert
        assertEquals(2, knapsack.getItems().size());
    }
}
