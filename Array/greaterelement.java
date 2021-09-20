class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] gre = nextGreaterRight(nums2);
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums2.length;i++)
            map.put(nums2[i],gre[i]);
        
        int[] ans = new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++)
            ans[i] = map.get(nums1[i]);
        
        return ans;
    }
    int[] nextGreaterRight(int[] nums)
    {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(st.size() >0 && st.peek() < nums[i])
                st.pop();
            ans[i] = st.size()>0 ? st.peek() : -1;
            st.push(nums[i]);
        }
        return ans;
    }
}
