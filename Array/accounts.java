class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(even(num)) {
                count++;
            }
        }
        
        return count;
    }
    
    //checking whether the no. of digits is even or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
            return numberOfDigits % 2 == 0;
    }
    
    //counting the no. of digits
    static int digits(int num) {
        int count = 0;
        
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
