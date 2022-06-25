class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = nums[0];
        int zeroCnt = 0;
        for(int i= 1;i<nums.length ;i++){
            int num = nums[i];
            if(num==0){
                zeroCnt++;
                continue;
            }
            prod *= num;
        }
        
        for(int i= 0;i<nums.length ;i++){
            if(zeroCnt > 1){
                nums[i] = 0;
                continue;
            }
            if(nums[i]==0)nums[i]=prod;
            else nums[i] = zeroCnt > 0 ? 0 : prod / nums[i];
        }
        
        return nums;
    }
}