class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode ptr1 = list1,ptr2 = list2;
        while(ptr1 != null && ptr2 !=null){
            if(ptr1.val < ptr2.val){
                dummy.next = ptr1;
                ptr1 = ptr1.next;
                dummy = dummy.next;
            }
            else{
                dummy.next = ptr2;
                ptr2 = ptr2.next;
                dummy = dummy.next;
            }
        }
        if(ptr1 != null){
            dummy.next = ptr1;
        }
        else{
            dummy.next = ptr2;
        }
        return head.next;
    }
}