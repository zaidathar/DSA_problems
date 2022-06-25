class Solution {
    public int fib(int n) {
        ArrayList<Integer> fib = new ArrayList<>(Arrays.asList(0,1));
        if(n<=1)return fib.get(n);
        
        for(int i = 2 ; i<=n;i++){
            fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return fib.get(n);
    }
}