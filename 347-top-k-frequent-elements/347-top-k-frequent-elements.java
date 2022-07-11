class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] res = new int[k];
        int j = 0, cnt = 1,size = nums.length;
        ArrayList<Integer>[] f = new ArrayList[size+1];
        for(int i = 1;i< size;i++){
            if(nums[i-1]==nums[i])cnt++;
            else{
                if(f[cnt]==null){
                    f[cnt]= new ArrayList<Integer>();
                }
                f[cnt].add(nums[i-1]);
                cnt = 1;
            }
        }
        
        f[cnt] = f[cnt]==null ? new ArrayList<Integer>() : f[cnt];
        f[cnt].add(nums[size-1]);
        for(int i = f.length-1 ; i >=0;i--){
            if(k==0)break;
            if(f[i]==null)continue;
            while(f[i].size()>0){
                if(k==0)break;
                res[j]=f[i].remove(0);
                j++;
                k--;
            }
        }
        return res;
    }
}