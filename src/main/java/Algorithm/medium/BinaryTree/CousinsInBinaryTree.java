package Algorithm.medium.BinaryTree;

/**
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 *
 */
public class CousinsInBinaryTree {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
          TreeNode xParent =null;
          TreeNode yParent =null;
          int xDepth = 0;
          int yDepth = 0;

          public boolean isCousins(TreeNode root, int x, int y) {
              bfs(root,x,y,null,1);
              return xParent!=yParent&&xDepth==yDepth?true:false;
          }
          public void bfs(TreeNode root,int x, int y,TreeNode parent,int depth){
              if(root == null) return;
              if(root.val == x){
                  xParent = parent;
                  xDepth = depth;
              }
              if(root.val == y){
                  yParent = parent;
                  yDepth = depth;
              }
              bfs(root.left,x,y,root,depth+1);
              bfs(root.right,x,y,root,depth+1);
          }
  }
}
