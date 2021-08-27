class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        
        // pointer for even indices
        int i = 0;
            
        // pointer for odd indices
        int j = 1;
            
        while(i < n && j < n) {
            //looping through even numbers
            // if the loop does not break, it means all the numbers are in the correct place
            while(i < n && nums[i] % 2 == 0) {
                i += 2;
            }
            
            //looping through odd numbers
            while(j < n && nums[j] % 2 == 1) {
                j += 2;
            }
     
