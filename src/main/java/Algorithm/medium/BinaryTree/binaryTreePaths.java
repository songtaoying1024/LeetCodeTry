package Algorithm.medium.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 *Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class binaryTreePaths {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        helper(res, root, sb);
//        return res;
//    }
//
//    private void helper(List<String> res, TreeNode root, StringBuilder sb) {
//        if(root == null) {
//            return;
//        }
//        int len = sb.length();
//        sb.append(root.val);
//        if(root.left == null && root.right == null) {
//            res.add(sb.toString());
//        } else {
//            sb.append("->");
//            helper(res, root.left, sb);
//            helper(res, root.right, sb);
//        }
//        sb.setLength(len);
//    }
}
