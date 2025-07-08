class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length; 

        // step 1 : move all non-zero to the front of the array 
        int j=0; 
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[j] = nums[i]; 
                j++; 
            }
        }
        // step 2 : then fill remaining data with zeros 
        while(j<n){
            nums[j] = 0; 
            j++; 
        }
    }
}