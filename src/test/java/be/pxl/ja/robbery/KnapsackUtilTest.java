package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackUtilTest {
    @Test
    public void testFill() throws KnapsackFullException {
        Product product = new Product("Product", 5, 10);
        Product product1 = new Product("Product 1", 10, 50);
        Product product2 = new Product("Product 2", 15, 70);

        Shop shop = new Shop();
        shop.add(product);
        shop.add(product1);
        shop.add(product2);
        Knapsack knapsack = new Knapsack(20);

        List<Product> items = new ArrayList<Product>();
        items.add(product2);
        items.add(product);

        KnapsackUtil.fill(knapsack, shop);

        Assertions.assertEquals(items, knapsack.getItems());
    }
}
