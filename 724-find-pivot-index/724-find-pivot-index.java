class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i= 0 ;i< nums.length;i++)sum+=nums[i];
        int leftSum = 0 , rightSum = sum;
        for(int i =0 ;i< nums.length;i++){
            if(leftSum == (rightSum - nums[i]))return i;
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return -1;
    }
}