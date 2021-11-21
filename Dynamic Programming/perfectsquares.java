public class Solution {
    public int numSquares(int n) {
        int[] record = new int[n+1];
        for(int i=0;i<=n;i++){
            record[i] = i;
            for(int j=1;j*j<=i;j++){
                record[i] = Math.min(record[i-j*j]+1,record[i]);
            }
        }
        return record[n];
    }
}
