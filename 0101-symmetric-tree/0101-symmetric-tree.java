/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean sym(TreeNode l,TreeNode r)
    {
        if(l==null || r==null) return l==r;
        return l.val==r.val && sym(l.left,r.right) && sym(r.left,l.right);
    }
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left,root.right);
    }
}