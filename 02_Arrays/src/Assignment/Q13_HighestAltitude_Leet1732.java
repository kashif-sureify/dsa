package Assignment;
// https://leetcode.com/problems/find-the-highest-altitude/submissions/1713264957/

public class Q13_HighestAltitude_Leet1732 {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int highest = 0;
        int altitudePoints[] = altitudes(gain);
        for (int i = 1; i < altitudePoints.length; i++) {
            if (altitudePoints[i] > highest) {
                highest = altitudePoints[i];
            }
        }
        return highest;
    }

    private static int[] altitudes(int[] gain) {
        int[] altitudePoints = new int[gain.length + 1];
        int point = 0;
        int sum = 0;
        for (int i = 1; i < altitudePoints.length; i++) {
            sum += gain[point];
            altitudePoints[i] = sum;
            point++;
        }

        return altitudePoints;
    }
}
