package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.Product;

import java.util.Collections;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, LondonAttractions londonAttractions) {
        Collections.sort(londonAttractions.items);
        for (Attraction item: londonAttractions.items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
