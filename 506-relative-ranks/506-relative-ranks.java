class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] index = new Integer[score.length];
        for(int i = 0;i<score.length;i++)index[i]=i;
        Arrays.sort(index , (a,b) -> (score[b]-score[a]));
        String[] winner= {"Gold Medal","Silver Medal","Bronze Medal"};
        String[] res = new String[score.length];

        for(Integer in : index)System.out.print(in+" ");
        System.out.println();
        for(int i = 0;i<score.length; i++){
            int standing = index[i];
            if(i < 3){
                res[standing] = winner[i];
            }
            else{
                res[standing] = String.valueOf(i+1);
            }
        }
        
        return res;
        
        
    }
}