package be.pxl.ja.citytrip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackUtilTest {
    @Test
    public void testFill() throws KnapsackFullException {
        Attraction attraction = new Attraction("Attraction", 5, 10);
        Attraction attraction1 = new Attraction("Attraction 1", 10, 50);
        Attraction attraction2 = new Attraction("Attraction 2", 15, 70);

        LondonAttractions londonAttractions = new LondonAttractions();
        londonAttractions.add(attraction);
        londonAttractions.add(attraction1);
        londonAttractions.add(attraction2);
        Knapsack knapsack = new Knapsack(20);

        List<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(attraction2);
        attractions.add(attraction);

        KnapsackUtil.fill(knapsack, londonAttractions);

        Assertions.assertEquals(attractions, knapsack.getItems());
    }
}
