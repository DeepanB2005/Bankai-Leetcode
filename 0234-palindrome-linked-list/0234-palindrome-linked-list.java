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
    public boolean isPalindrome(ListNode head) {
        ListNode r=new ListNode();
        ListNode t=head;
        ListNode c=r;
        while(t!=null)
        {
            c.next=new ListNode(t.val);
            c=c.next;
            t=t.next;
        }
        ListNode p=null;
        ListNode cur=r.next;
        while(cur!=null)
        {
            ListNode n= cur.next;
            cur.next=p;
            p=cur;
            cur=n;
        }
        ListNode a=p;
        ListNode b=head;
        while(a!=null)
        {
            if(a.val!=b.val)return false;
            a=a.next;
            b=b.next;
        }
        return true;
    }
}