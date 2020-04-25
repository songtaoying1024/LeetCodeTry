package Algorithm.medium.BinaryTree;

import java.util.HashSet;

/**
 * 用到广度优先的算法
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 * Example 1:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * Output: True
 *
 *
 * Example 2:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * Output: False
 *
 */
public class BSTTwoSum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet();
        return bfs(root,set,k);

    }
    public boolean bfs(TreeNode root, HashSet<Integer> set, int k ){
        if(root == null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return bfs(root.left,set,k) || bfs(root.right,set,k);
    }

    public static void main(String[] args) {
        System.out.println(0^'a'^'b');
    }

}
