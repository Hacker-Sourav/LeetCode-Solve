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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max=-1;
        for(int num : nums)
            max = num > max ? num : max;
        boolean[] freq = new boolean[max+1];
        for(int num : nums) freq[num]=true;
        
        ListNode curr = new ListNode();
        ListNode temp = curr;
        
        while(head!=null){
            if(head.val > max || freq[head.val]==false){
                curr.next=head;
                curr=curr.next;
            }
            head=head.next;
        }
        curr.next=null;
        return temp.next;
    }
}