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
        int[][] ans = new int[m][n];
        for(int k=0;k<m;k++){
            Arrays.fill(ans[k],-1);
        }
        ListNode itr = head;
        int i=0,j=0;
        int t=0,l=0,r=n-1,d=m-1;
        while(itr!=null){
            for(i=t,j=l;j<=r;j++){
                if(itr==null){
                    return ans;
                }
                ans[i][j]=itr.val;
                itr=itr.next;
            }
            t++;
            for(i=t,j=r;i<=d;i++){
                if(itr==null){
                    return ans;
                }
                ans[i][j]=itr.val;
                itr=itr.next;
            }
            r--;
            for(i=d,j=r;j>=l;j--){
                if(itr==null){
                    return ans;
                }
                ans[i][j]=itr.val;
                itr=itr.next;
            }
            d--;
            for(i=d,j=l;i>=t;i--){
                if(itr==null){
                    return ans;
                }
                ans[i][j]=itr.val;
                itr=itr.next;
            }
            l++;            
        }
        return ans;
    }
}