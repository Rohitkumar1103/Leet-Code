class Solution {
    private boolean path(ListNode head, TreeNode root,ListNode th){
        if(head==null) return true;
        if(root==null) return false;

        if(root.val==head.val)
          return path(head.next, root.left,th)||
            path(head.next,root.right,th);

        if(th.val==root.val) 
        return path(head,root.left,th.next) || path(head,root.right,th.next);

        else
        return path(th,root.left,th) || path(th,root.right,th);
    }
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null) return true;
        if(root==null) return false;
        return path(head,root,head);
    }
}