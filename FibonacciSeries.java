class Fibonacci {
    public int fib(int n) {
     if(n == 0 || n == 1)
            return n;
        int prev = 1;
        int pre_prev = 0;
        int i = 2;
        int nextTerm = 0;
        
        while(i <= n){
            nextTerm = prev + pre_prev;
            pre_prev = prev;
            prev = nextTerm;
            i++;
        }
        
        return nextTerm;
    }
    
}