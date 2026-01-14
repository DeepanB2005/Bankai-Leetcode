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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return head;
        ListNode n=new ListNode();
        ListNode f=head.next;
        ListNode s=head;
        ListNode t1=n;
        while(s!=null)
        {
            t1.next=new ListNode(s.val);
            t1=t1.next;
            if(s.next==null)break;
            s=s.next.next;
        }
        while(f!=null)
        {
            t1.next=new ListNode(f.val);
            t1=t1.next;
            if(f.next==null)break;
            f=f.next.next;
        }
        return n.next;
    }
}