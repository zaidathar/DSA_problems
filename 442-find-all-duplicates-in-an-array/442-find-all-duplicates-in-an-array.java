class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // first Brute force algorithm 
        Arrays.sort(nums);
        List<Integer> numbersAppearTwice = new ArrayList<>();
        for(int i = 1 ;i<nums.length ;i+=1){
            if(nums[i-1]==nums[i])numbersAppearTwice.add(nums[i]);
            
        }
        return numbersAppearTwice;
    }
}