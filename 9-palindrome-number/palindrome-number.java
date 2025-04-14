class Solution {
    public boolean isPalindrome(int x) {
       int dup = Math.abs(x); 
       int rev = 0; 

       while(dup>0){
          int last_digit = dup%10; // retrive last digite

          dup = dup/10; 

          rev = (rev*10) + last_digit; 
       } 

       return (rev==x)?true:false; 
    }
}