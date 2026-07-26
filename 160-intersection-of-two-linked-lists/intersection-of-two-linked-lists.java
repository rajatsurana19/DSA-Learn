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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode i1 = headA;
        ListNode i2 = headB;

        while(i1!=i2){
            i1 = i1.next;
            i2 = i2.next;

            if(i1 == i2){
                return i1;
            }
            else if(i1 == null){
                i1 = headB;
            }
            else if(i2 == null) {
                i2 = headA;
            }
        }
        return i1;

    }
}