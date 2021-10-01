class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode sol=null;
        
        if(l1.val<=l2.val){
            sol=l1;
            sol.next=mergeTwoLists(l1.next,l2);
        }
        else if(l1.val>l2.val){
            sol=l2;
            sol.next=mergeTwoLists(l1,l2.next);
        }
        return sol;
    }
}
