package LinkedList.RecursiveReverse;

import LinkedList.ListNode;

class Solution {
    // ------Recursive approach------
    public ListNode reverseList(ListNode head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        // recursive case
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
}