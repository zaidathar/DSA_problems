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
    public void invert(TreeNode root){
        Stack<TreeNode> stack = new Stack();
        
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }
            else{
                if(stack.isEmpty())break;
                root = stack.peek();
                stack.pop();
                TreeNode left = root.left;
                root.left = root.right;
                root.right = left;
                root = root.left;
            }
        }
        
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
        
    }
}