class Solution {
    public int reverse(int x) {

        int n = Math.abs(x); //abs() used to get the absolute (positive) value of a number.
         
        int rev = 0; 

        while(n != 0){
            // get the last digite of n
            int last_digit = n%10; 
            
            // check the largest possible value of integer, if rev is larger than int size then return 0
            if(rev > (Integer.MAX_VALUE - last_digit)/10){
                return 0; 
            }

            // remove last_digit from the n by dividing n. 
            n=n/10;

            
            rev = (rev*10)+ last_digit; 
             
        }

        if(x<0){
            return -rev; 
        }
        else{
            return rev; 
        }
        // return (x<0) ? (-rev) : rev; 

        // -Time Complexity: O(log(x))
        // -Space Complexity: O(1)
        
    }
}