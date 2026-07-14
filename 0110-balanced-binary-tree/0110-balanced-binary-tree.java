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
    public int d(TreeNode root,boolean[] f){
        if(root==null) return 0;
        int k=d(root.left,f);
        int l=d(root.right,f);

        if(Math.abs(k-l)>1){
            f[0]=true;
        }
        return Math.max(k,l)+1;
    }
    public boolean isBalanced(TreeNode root) {
    boolean[] a=new  boolean[1];
    d(root,a);
    return a[0]?false:true;
    }
}