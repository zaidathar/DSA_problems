class Solution {
    
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes ,Comparator.comparingInt(o -> o[1]));

        int maxUnits = 0 , ind = boxTypes.length-1;
        while(truckSize > 0){
            if(ind < 0)break;
            
            maxUnits+=(truckSize >= boxTypes[ind][0] ? boxTypes[ind][0]*boxTypes[ind][1] : truckSize * boxTypes[ind][1]);
            truckSize -= boxTypes[ind][0];
            ind--;
        }
        return maxUnits;
    }
}