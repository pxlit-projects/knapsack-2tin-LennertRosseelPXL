package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testCompareTo() {
        // act
        Product product = new Product("Product 1", 20, 15);

        // assert
        assertEquals(-1, product.compareTo(new Product("Product 2", 20, 10)));
        assertEquals(0, product.compareTo(new Product("Product 2", 20, 15)));
        assertEquals(1, product.compareTo(new Product("Product 3", 20, 20)));
    }
}
