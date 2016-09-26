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

        public List<Integer> postorderTraversal(TreeNode root) {
                List<Integer> ans = new ArrayList();
                if (root == null) return ans;
                Stack<TreeNode> st = new Stack();
                st.push(root);
                
                for (TreeNode p = root, prev; !st.empty();) {
                    prev = p;
                    p = st.peek();
                    if (p.left != null && p.left != prev && p.right != prev) 
                        st.push(p.left);
                    else
                    if (p.right != null && p.right != prev) 
                        st.push(p.right);
                    else
                        ans.add(st.pop().val);
                }
                return ans;
            }
｝