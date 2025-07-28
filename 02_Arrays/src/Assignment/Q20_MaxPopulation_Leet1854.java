package Assignment;
// https://leetcode.com/problems/maximum-population-year/submissions/1714931405/

public class Q20_MaxPopulation_Leet1854 {
    public static void main(String[] args) {
        // int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
        int[][] logs = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        System.out.println(maximumPopulation(logs));
    }

    private static int maximumPopulation(int[][] logs) {
        int years[] = new int[2051 - 1950 + 1];

        for (int log[] : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int population = 0;
        int maximumPopulation = 0;
        int maxYear = 0;
        for (int year = 1950; year <= 2050; year++) {
            population += years[year - 1950];
            if (population > maximumPopulation) {
                maximumPopulation = population;
                maxYear = year;
            }
        }
        return maxYear;

    }
}
