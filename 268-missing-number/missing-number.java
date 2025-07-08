class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length; 

        // if(n<=2){
        //     return n; 
        // }

        // if()

        // if(n==1){
        //     return n;
        // }

        int hash[] = new int[n+1]; 

        for(int i=0; i<n; i++){
            hash[nums[i]]+=1; 
        }

        // int flag = -1;

        for(int i=0; i<=n; i++){
            if(hash[i]==0){
                return i; 
            }
        }
        return -1; 
    }
}