class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // if the array is empty
        if(nums == null || n == 0) {
            return ans;
        }
        
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int target2 = target - (nums[i] + nums[j]);
                int start = j+1;
                int end = n-1;
                
                while(start < end) {
                    int current = nums[start] + nums[end];
                    if(current > target2) {
                        end--;
                    } else if(current < target2) {
                        start++;
                    } else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[start]);
                        quad.add(nums[end]);
                        ans.add(quad);
                        
                         // jumping the duplicates of start
                        while(start < end && nums[start] == quad.get(2)) {
                           start++;
                           }
                        
                           // jumping the duplicates of end
                         while(start < end  && nums[end] == quad.get(3)) {
                                end--;
                               }
                 
                    }
                }
                
                // jumping the duplicates of j
                while(j+1<n && nums[j] == nums[j+1]) {
                    j++;
                }
            }
            
            // jumping the duplicates of i
            while(i+1<n && nums[i] == nums[i+1]) {
                i++;
            }
        }
        
        return ans;
    }
}
