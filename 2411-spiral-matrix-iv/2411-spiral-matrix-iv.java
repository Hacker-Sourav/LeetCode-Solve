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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][];
        for(int i=0;i<m;i++){
            ans[i]=new int[n];
            Arrays.fill(ans[i],-1);
        }

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        while(head!=null){
            // left to right...
            for(int k=left;k<=right && head!=null;k++,head=head.next){
                ans[top][k]=head.val;
            }
            top++;
            // top to bottom...
            for(int k=top;k<=bottom && head!=null;k++,head=head.next){
                ans[k][right]=head.val;
            }
            right--;
            // right to left...
            for(int k=right;k>=left && head!=null;k--,head=head.next){
                ans[bottom][k]=head.val;
            }
            bottom--;
            // bottom to top...
            for(int k=bottom;k>=top && head!=null;k--,head=head.next){
                ans[k][left]=head.val;
            }
            left++;
            // end of one spiral
        }
        return ans;
    }
}



















