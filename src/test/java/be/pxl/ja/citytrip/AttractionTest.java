package be.pxl.ja.citytrip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AttractionTest {
    @Test
    public void testCompareTo() {
        // act
        Attraction attraction = new Attraction("Product 1", 20, 15);

        // assert
        assertEquals(-1, attraction.compareTo(new Attraction("Product 2", 20, 10)));
        assertEquals(0, attraction.compareTo(new Attraction("Product 2", 20, 15)));
        assertEquals(1, attraction.compareTo(new Attraction("Product 3", 20, 20)));
    }
}
