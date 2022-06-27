class Solution {
    
    public int climbStairs(int n) {
        int[] dp = new int[n+2];
        dp[1]=1;dp[2]=1;
        
        for(int i = 3;i<dp.length ;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        
        return dp[n+1];
    }
}