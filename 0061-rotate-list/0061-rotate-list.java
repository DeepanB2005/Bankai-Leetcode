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
    public ListNode rev(ListNode c)
    {
        ListNode p=null;
        while(c!=null)
        {
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int c=1;
        while(temp!=null && temp.next!=null){
            c++;
            temp = temp.next;
        }
        k=k%c;
        if(k==0)return head;
        ListNode t=rev(head);
        ListNode t1=t;
        for(int i=1;i<k;i++)
        {
            t1=t1.next;
        }

        ListNode st = t1.next;
        t1.next=null;
        ListNode newhead = rev(t);
        t.next=rev(st);
        return newhead;
    }
}