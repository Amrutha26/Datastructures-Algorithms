class Solution {
    public boolean isPalindrome(int x) {
            int temp=x,sum=0;
            while(temp>0){
                int last = temp%10;
                temp/=10;
                sum=(sum*10)+ last;
            }
            if(sum==x){
                return true;
            }
        return false;
    }
}
