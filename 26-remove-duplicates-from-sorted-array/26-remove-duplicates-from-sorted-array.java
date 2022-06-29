class Solution {
    public int removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=nums[0];
        int cnt = 1 , j =1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                res[j]=nums[i];
                cnt++;
                j++;
            }
        }
        for(int i = 0 ; i<cnt;i++)nums[i]=res[i];
        return cnt;
        
    }
    
}