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
        int c=0;
        ListNode t=head;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        int p=c-n;
        if(c==n)return head.next;
        t=head;
        for(int i=1;i<p;i++)
        {
            t=t.next;
        }
        
        t.next=t.next.next;
        
        return head;
    }
}