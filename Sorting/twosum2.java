class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int first_pointer = 0;
        int last_pointer = n-1;
            
        while(first_pointer < last_pointer) {
            if(numbers[first_pointer] + numbers[last_pointer] == target) {
                return new int[] {first_pointer+1, last_pointer+1};
            } else if(numbers[first_pointer] + numbers[last_pointer] > target) {
                last_pointer--;
            } else {
                first_pointer++;
            }
        }
        
        return new int[] {-1,-1};
    }
}

