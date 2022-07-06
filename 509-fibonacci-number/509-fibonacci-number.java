class Solution {
    public ArrayList<Integer> fib = new ArrayList<>(Arrays.asList(0,1));
    public int fib(int n) {
        if(n<=1)return fib.get(n);
        for(int i = 2 ; i<=n;i++){
            fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return fib.get(n);
    }
}