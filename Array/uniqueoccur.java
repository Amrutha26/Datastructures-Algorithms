class Solution {

public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    List list = new ArrayList<>();
    
    for(int i = 0; i <arr.length; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }
    
    for(Map.Entry x : map.entrySet()) {
        int frequency = (int)x.getValue();
        if(!list.contains(frequency)) 
              list.add(frequency);
         else
             return false;                    
    }        
    return true;
  }
}
