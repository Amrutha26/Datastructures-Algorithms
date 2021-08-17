class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] ans = new int[n];
        
        ans[0] = 1;        
        
        // calculating the left_products and storing inside the ans array
        for(int i=1; i<n; i++) {
            ans[i] = nums[i-1] * ans[i-1];
        }
        
        int R = 1; //to calculate the right_products
        for(int i=n-1; i>=0; i--) {
            ans[i] = ans[i] * R;
            R = R * nums[i];
        }
        
        return ans;
        
    }
}
