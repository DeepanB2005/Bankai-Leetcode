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
    public ListNode rev(ListNode l)
    {
        ListNode p=null;
        ListNode c=l;
        while(c!=null)
        {
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        int c=0;
        ListNode r=new ListNode(0);
        ListNode op=r;
        while(t1!=null ||t2!=null || c!=0)
        {
            int s=c;
            if(t1!=null)
            {
                s+=t1.val;
                t1=t1.next;
            }
            if(t2!=null)
            {
                s+=t2.val;
                t2=t2.next;
            }
            c=s/10;
            s=s%10;
            r.next=new ListNode(s);
            r=r.next;
        }
        return op.next;
    }
}