public class Day05WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {

            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }

    public static void main(String[] args) {
        Day05WaterBottles solution = new Day05WaterBottles();

        int numBottles1 = 9;
        int numExchange1 = 3;

        int numBottles2 = 15;
        int numExchange2 = 4;

        System.out.println(" Output: " + solution.numWaterBottles(numBottles1, numExchange1));
        System.out.println(" Output: " + solution.numWaterBottles(numBottles2, numExchange2));

    }
}