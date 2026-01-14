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
        ListNode t=r;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        while(s!=null)
        {
            t.next=new ListNode(s.val);
            s=s.next;
            t=t.next;
        }
        t=r.next;
        ListNode p=null;
        while(t!=null)
        {
            ListNode n=t.next;
            t.next=p;
            p=t;
            t=n;
        }
        ListNode aa=p;
        ListNode ab=head;
        while(aa!=null)
        {
            if(aa.val!=ab.val)return false;
            aa=aa.next;
            ab=ab.next;
        }
        return true;
    }
}