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
        temp.next = head;
        ListNode t= head;
        for(int i=1;i<c-k;i++){
            t=t.next;
        }
        ListNode st = t.next;
        t.next=null;
        return st;
        
    }
}