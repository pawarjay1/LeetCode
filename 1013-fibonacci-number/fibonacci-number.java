class Solution {
    public int fib(int n) {

        if(n<=1){ // base condition if n is = or larger than n then return n.
            return n; 
        }

        // 1 1 2 3 fibnonacci serias 
        // for example n=4; 

        int last = fib(n-1); 
        int secondLast = fib(n-2); // always create decision tree for multiple recursion calls 

        return last + secondLast; 
    }
}