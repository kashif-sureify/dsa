package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Q6_GreatestCandies_1431 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> candyList = kidsWithCandies(candies, extraCandies);
        System.out.println(candyList);

    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candyList = new ArrayList<>();
        int maxCandy = maxCandy(candies);
        for (int i = 0; i < candies.length; i++) {
            candyList.add(candies[i] + extraCandies >= maxCandy);
        }
        return candyList;
    }

    private static int maxCandy(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        return max;
    }
}
