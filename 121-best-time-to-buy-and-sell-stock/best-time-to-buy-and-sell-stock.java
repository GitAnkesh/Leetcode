/*class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int minSofar=prices[0];
        for(int i = 1; i<prices.length;i++){
            minSofar=Math.max(minSofar,prices[i]);
            int profit =prices[i]-minSofar;
            maxProfit= Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSofar = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            minSofar = Math.min(minSofar, prices[i]); // Corrected to find the minimum so far
            int profit = prices[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
