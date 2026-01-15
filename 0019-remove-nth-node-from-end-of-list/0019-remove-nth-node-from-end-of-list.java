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
        ListNode t=head;
        int c=0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        if(c==n)return head.next;
        int r=c-n;

        t=head;
        for(int i=0;i<r-1;i++)
        {
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}