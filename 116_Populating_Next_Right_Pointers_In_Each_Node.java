//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/#/description
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
      
        recur(root.left, root.right);
    }
    
    public void recur(TreeLinkNode left, TreeLinkNode right) {
        if(left != null && right != null) {
            left.next = right;
            if(left.right != null) left.right.next = right.left;
            recur(left.right, right.left);
            recur(left.left, left.right);
            recur(right.left, right.right);
        }
    }
}