class Solution {
    public int numPairsDivisibleBy60(int[] time) {
         int[] count = new int[60];
         for(int num : time) {
             count[num % 60]++;
         }
        int ans = 0;
        for(int i=1; i<30; i++) {
            ans += count[i] * count[60-i];
        }
        ans += ((count[0]) * (count[0] - 1)) / 2;
        ans += ((count[30]) * (count[30] - 1)) / 2;
        
        return ans;
    }
}
