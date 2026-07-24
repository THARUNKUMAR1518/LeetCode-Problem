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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> a=new ArrayList<>();
       Stack <TreeNode> g=new Stack<>();
       while(root!=null || !g.isEmpty()){
        while(root!=null){
            g.push(root);
            a.add(root.val);
            root=root.left;
        }
           root=g.pop();
           root=root.right;
       }
       return a;
    }
}