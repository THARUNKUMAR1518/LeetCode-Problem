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
    TreeNode pre=null,f=null,s=null;
    public void recoverTree(TreeNode root) {
    if(root==null) return;
    d(root);
    int t=f.val;
    f.val=s.val;
    s.val=t;
}
public void d(TreeNode root){
    if(root==null) return;
    d(root.left);
    if(pre!=null&&pre.val>root.val){
        if(f==null) f=pre;
        s=root;
    }
    pre=root;
    d(root.right);
    
}
}