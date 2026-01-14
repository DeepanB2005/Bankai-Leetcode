/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        int c=0;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            f=head;
            while(f!=s)
            {
                s=s.next;
                f=f.next;
            }
            if(s==f)return s;
        }
        return null;
    }
}