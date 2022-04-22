package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BuyAndSellStocksTest {
    @Test void test()
    {
        // ArrayList<Integer> arr = new ArrayList<Integer>(List.of(7,1,5,3,6,4));
        int[] prices = {7,1,5,3,6,4};
        BuyAndSellStock.maxProfit(prices);
    }
}
