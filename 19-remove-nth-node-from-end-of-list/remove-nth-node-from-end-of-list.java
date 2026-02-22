/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        if(head == null ) return head;
        //move fast node n spcae a head
         for(int i  = 0 ; i < n ;i++){
            fast = fast.next;
        }
        // now move both until fast next is null
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // now we have to move the next node of the sloe to remove nth node 
        slow.next = slow.next.next;
        return dummy.next;
    
    }
}