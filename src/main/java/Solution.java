class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) {
            return false;
        }
        if(head.val == root.val) {
            if(check(head, root)) {
                return true;
            }
        }

        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    boolean check (ListNode head, TreeNode root) {
        if(head == null) {
            return true;
        }
        if(root == null || root.val != head.val) {
            return false;
        }
        

        return check(head.next, root.left) || check(head.next, root.right); 
    }
}