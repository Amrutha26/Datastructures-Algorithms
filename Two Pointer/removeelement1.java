class Solution {
    public int removeElement(int[] A, int elem) {
        int valid_size = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] != elem) {
                A[valid_size] = A[i];
                valid_size++;
            }
        }
        
        return valid_size;
    }
}
