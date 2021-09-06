class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[n-1];
        Arrays.sort(nums);
        
        for(int i=0; i<n-2; i++) {
            int start = i+1;
            int end = n-1;
            
            while(start < end) {
                int current_sum = nums[i] + nums[start] + nums[end];
                if(current_sum > target) {
                    end--;
                } else {
                    start++;
                }
                
                if(Math.abs(current_sum - target) < Math.abs(result - target)) {
                result = current_sum;
            }
                       
            }
        }
        
        return result;
    }
}
