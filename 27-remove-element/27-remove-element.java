class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int i =0 ;
        for(int num : nums){
            if(num!=val){
                arr[i] = num;
                i++;
            }
        }
        for(int j = 0 ;j < nums.length ;j++){
            nums[j] = arr[j];
        }
        return i;
    }
}