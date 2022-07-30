class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] track = Arrays.copyOf(score,score.length);
        Arrays.sort(track);
        Map<Integer,Integer> mp = new HashMap<>();
        int size = track.length;
        for(int i = 0 ;i<size;i++){
            mp.put(track[i],size-i);
        }
        
        String[] winner= {"Gold Medal","Silver Medal","Bronze Medal"};
        String[] res = new String[size];
        
        for(int i = 0;i<score.length; i++){
            int standing = mp.get(score[i]);
            
            if(standing < 4){
                res[i] = winner[standing-1];
            }
            else{
                res[i] = String.valueOf(standing);
            }
        }
        
        return res;
        
        
    }
}