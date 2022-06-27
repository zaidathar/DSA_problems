class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //second using hashmap O(n)
        List<Integer> numbersAppearTwice = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0;i< nums.length ;i++){
            map.put(nums[i],map.get(nums[i])==null ? 1 : map.get(nums[i])+1);
            
        }
        for(Map.Entry mp : map.entrySet()){
            if(mp.getValue().equals(Integer.valueOf(2))){
                numbersAppearTwice.add((Integer)mp.getKey());
            }
        }
        
        return numbersAppearTwice;
        
        /*
         //first Brute force algorithm O(nlogn)
        Arrays.sort(nums);
        List<Integer> numbersAppearTwice = new ArrayList<>();
        for(int i = 1 ;i<nums.length ;i+=1){
            if(nums[i-1]==nums[i])numbersAppearTwice.add(nums[i]);
            
        }
        return numbersAppearTwice;
        */
    }
}