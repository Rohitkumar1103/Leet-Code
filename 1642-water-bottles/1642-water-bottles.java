class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxDrink = 0;
        int empty = 0;

        while(numBottles > 0){
            maxDrink += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
    return maxDrink;
    }
}