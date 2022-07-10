class Solution {
    public int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int step = cost.length;
        dp = new int[step];
        return Math.min(minCost(step-1,cost),minCost(step-2,cost));
    }
    
    public int minCost(int n,int[] cost){
        if(n<0)return 0;
        if(n<1)return cost[n];
        if(dp[n]!=0)return dp[n];
        
        dp[n]=cost[n]+Math.min(minCost(n-1,cost),minCost(n-2,cost));
        return dp[n];
    }
}