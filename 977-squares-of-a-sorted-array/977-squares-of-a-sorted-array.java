class Solution {
    
    public int[] sortedSquares(int[] nums) {
        int size = nums.length ;
        int[] res = new int[size];
        int front = 0 , back = size-1;
        
        for(int i=size-1;i>=0;i--){
            if(Math.abs(nums[front]) > Math.abs(nums[back])){
                res[i]= nums[front]*nums[front];
                front++;
            }
            else {
                res[i]= nums[back]*nums[back];
                back--;
            }
        }
        return res;
    } 
}