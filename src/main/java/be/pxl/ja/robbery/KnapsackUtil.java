package be.pxl.ja.robbery;

import java.util.Collections;
import java.util.Comparator;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, Shop shop) throws KnapsackFullException {
        Collections.sort(shop.items);
        for (Product item: shop.items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
