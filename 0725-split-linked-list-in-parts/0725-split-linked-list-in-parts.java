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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        int base=size/k;
        int extra=size%k;
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=base;
            if(extra!=0){
                arr[i]++;
                extra--;
            }
        }
        
        ListNode[] ans=new ListNode[k];
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ans[i]=head;
            while(arr[i]--!=0 && head!=null){
                prev=head;
                head=head.next;
            }
            if(prev!=null)
                prev.next=null;
        }
        return ans;
    }
}