class Solution {
    public int[] buildArray(int[] nums) {
        int len=nums.length;
        int[] list=new int[len];
        for(int i=0;i<len;i++){
            
            list[i]=nums[nums[i]];
        }
        return list;
    }
}
