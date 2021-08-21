class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // Koko should eat atleast 1 banana
        int start = 1;
        
        // Maximum value in the array -> Max value Koko should eat
        int end = Arrays.stream(piles).max().getAsInt();
        
        while(start <= end) {
            
            // Here, mid represents k value
            int mid = start + (end - start) / 2;
            
            //Checking if Koko can eat all the bananas in given time H
            if(canEatInTime(piles, mid, h)) {
                
                // finding other cases - optimal
                end = mid - 1;
            } else {
               start = mid + 1;      
            }
            
        }
        
        return start;
    }
    
    
    private boolean canEatInTime(int[] piles, int k, int h) {
         int hours = 0;
         
        for(int pile : piles) {
            int ans = pile / k;
            hours += ans;
            if(pile % k != 0){
                hours++;
            }
        }
        
        return hours <= h;
        
    }
}
