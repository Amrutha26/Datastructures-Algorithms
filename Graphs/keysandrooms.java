class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        HashSet<Integer> visited = new HashSet<>();
        // we start at room 0 -> problem description
        visited.add(0);
        
        // Stack to represent all the rooms that we can access from 0
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        
        while(!stack.isEmpty()) {
            List<Integer> keys = rooms.get(stack.pop());
            for(int key : keys) {
                if(!visited.contains(key)) {
                    visited.add(key);
                    stack.add(key);
                }
            }
        }
         return visited.size() == rooms.size();
    }
}
