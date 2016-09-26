/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        TreeNode p = root;
        while(p != null){
            System.out.println(p.val);
            while(p.left != null){
                TreeNode t = getRightest(p);
                if(t.right == null){
                    t.right = p;
                    p = p.left;
                }else{
                    t.right = null;
                    result.add(p.val);
                    p = p.right;
                }
                
            }
            result.add(p.val);
            p = p.right;
        }
        return result;
    }
    
    private static TreeNode getRightest(TreeNode node){
        TreeNode parent = node;
        node = node.left;
        while(node.right != null && node.right != parent){
            node = node.right;
        }
        return node;
    }
}