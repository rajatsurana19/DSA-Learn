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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;
        ListNode dum = new ListNode(0);
        ListNode tai = dum;

        while(l1 != null || l2 != null || rem !=0){
            int d1 = (l1!= null)?l1.val : 0;
            int d2 = (l2!=null)?l2.val :0;

            int sum = d1+d2+rem;
            int di = sum%10;
            rem = sum/10;
            ListNode newN = new ListNode(di);
            tai.next = newN;
            tai = tai.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        
        ListNode res = dum.next;
        dum.next = null;

        return res;

    }
}