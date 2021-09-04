class Solution {
    public void sortColors(int[] nums) {
       
        if(nums.length == 0 || nums.length == 1) return;
        
        // tracking 0s
        int start = 0;
        // tracking the elements
        int index = 0;      
        // tracking 2s
        int end = nums.length-1;
        
         while(index<= end) {
             if(nums[index] == 0) {
        // we are not using temp variable because we know the index's element to be 0
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
             } else if(nums[index] == 2) {
                 nums[index] = nums[end];
                 nums[end] = 2;
                 end--;
             } else {
                 index++;
             }
         }
    }
}
