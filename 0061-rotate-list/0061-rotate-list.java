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
    public ListNode rotateRight(ListNode head, int k) {
        int c=1;
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        k%=c;
        temp.next=head;
        ListNode t=head;
        for(int i=1;i<c-k;i++)
        {
            t=t.next;
        }
        head=t.next;
        t.next=null;
        return head;
    }
}