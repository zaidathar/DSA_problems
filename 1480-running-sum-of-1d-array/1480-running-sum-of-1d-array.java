class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        int ind = nums.length-1;
       
        for(int i = ind ;i>=0;i--){
            int prevSum = sum - nums[i];
            nums[i]=sum;
            sum=prevSum;
        }
        return nums;
    }
}