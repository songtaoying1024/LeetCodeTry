package Algorithm.medium;

import Algorithm.easy.DiameterOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, return the sum of values of its deepest leaves.
 *
 *
 * Example 1:
 *
 *
 *
 * Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * Output: 15
 */
public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level_sum = 0;
        while (!queue.isEmpty()) {
            level_sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current_Node = queue.poll();
                level_sum += current_Node.val;
                if (current_Node.left != null) queue.offer(current_Node.left);
                if (current_Node.right != null) queue.offer(current_Node.right);

            }
        }
        return level_sum;
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
