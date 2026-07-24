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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        Stack<TreeNode> g=new Stack<>();
        TreeNode l=null;
        while(root!=null||!g.isEmpty()){
            while(root!=null){
                g.push(root);
                root=root.left;
                
            }
            TreeNode p=g.peek();
            if(p.right!=null && l!=p.right){
                root=p.right;
            }
            else{
            a.add(p.val);
            l=g.pop();}
        }
        return a;
    }
}