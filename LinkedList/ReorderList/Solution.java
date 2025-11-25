package LinkedList.ReorderList;

import LinkedList.ListNode;

class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;


        // find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        // Now slow is at middle
        ListNode prev = null;
        ListNode curr = slow.next;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        // now setting the first half ending correctly
        slow.next = null;


        // Merge two lists
        ListNode first = head;
        ListNode second = prev;
        while(second!= null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            //update first and second pointers
            first = temp1;
            second = temp2;
        }
    }
}