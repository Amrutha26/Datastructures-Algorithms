class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st = 0;
        int end  = nums.length-1;
        while(st <=  end){
            int m = (st+ end)/2;
            if(m -1 >=0 && nums[m-1] == nums[m])
            {
			//pattern (odd, even) --> single element to the left
                if(m%2 ==0 )
                    end= m-1;
			//pattern (even, odd) ----> single element to the right
                else
                    st = m+1;
            }
            else if(m+1 < nums.length && nums[m+1] == nums[m]){
			
			//pattern (even, odd) --> single element to the right
                if(m%2 == 0)
                    st = m+1;
				//pattern (odd, even) --> single element to the left
                else
                    end  = m-1;
            }
            else
           {
			   //not a pair element ---> single element found 
			   return nums[m];
		   }
        }
		//no single element in the array
        return -1;
    }
}
