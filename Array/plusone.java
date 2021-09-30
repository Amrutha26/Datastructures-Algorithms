class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n - 1; i >= 0; i--){ //iterate from the end
            if(digits[i]+1==10){ //if overflow, keep adding
                digits[i] = 0;
            }
            else{ //else just add one to the current digit and return
                digits[i] = digits[i]+1; 
                return digits;
            }
        }
        //If the for loop is finished till the end, we have something like [0,0,0...,n]
        int [] newDigits = new int [n+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
