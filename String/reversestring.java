class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n-1;
           
        swap(s,i,j);
    }
    
    public void swap(char[] s, int i, int j) {
          
        //Base case
        if(i == j || i > j) {
            return;
        }
        
        
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        swap(s, i+1,j-1);
    }
}
