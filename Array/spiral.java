class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>() ;
        
        int m = matrix.length-1 ;
        int n = matrix[0].length -1;
        
        int left  = 0;
        int right = n ;
        int top =  0 ;
        int down =  m ;
        
        int d =0 ;
        
        while(left<=right && top<=down){
            
            if(d==0){
                for(int i = left ; i<= right ;i++){
                    res.add(matrix[top][i]) ;
                }
                top++ ;
            }else if(d==1){
                for(int i = top ; i<= down ;i++){
                    res.add(matrix[i][right]);
                }
                right-- ;
            }else if(d==2){
                for(int i= right ;i >=left ;i--){
                    res.add(matrix[down][i]) ;
                }
                down-- ;
            }else if(d==3){
                for(int i= down ; i>=top ;i--){
                    res.add(matrix[i][left]) ;
                }
                left++ ;
            }
            d = (d+1)%4 ;
            
        }
        return res ;
    }
}
