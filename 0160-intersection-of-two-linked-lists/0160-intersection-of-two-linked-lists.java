/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int count(ListNode l)
    {
        int c=0;
        ListNode t=l;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        int c1=count(l1);
        int c2=count(l2);
        while(c1>c2)
        {
            l1=l1.next;
            c1--;
        }
        while(c2>c1)
        {
            l2=l2.next;
            c2--;
        }
        while(l1!=l2)
        {
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
    }
}