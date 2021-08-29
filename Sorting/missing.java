class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n) {
            if(nums[i] != i) {
                if(nums[i] == n) {
                    i++;
                } else {
                    int position = nums[i];
                    int temp = nums[i];
                    nums[i] = nums[position];
                    nums[position] = temp;
                }
            } else {
                i++;
            }
        }

        for(i=0; i<n; i++) {
            if(nums[i] != i) {
                return i;
            } 
        }

        return n;
    }
}
