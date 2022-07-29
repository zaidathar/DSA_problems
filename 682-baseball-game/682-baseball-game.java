class Solution {
    public int calPoints(String[] ops) {
        List<Integer> res = new ArrayList<>();
        
        for(String s : ops){
            int len = res.size();
            if(s.equals("C")){
                res.remove(len-1);
            }
            else if(s.equals("D")){
                res.add(res.get(len-1)*2);
            }
            else if(s.equals("+")){
                res.add(res.get(len-1)+res.get(len-2));
            }
            else{
                res.add(Integer.valueOf(s));
            }
        }
        int sum = 0 ;
        
        for(Integer i :res){
            sum+=i;
        }
        return sum;
    }
}