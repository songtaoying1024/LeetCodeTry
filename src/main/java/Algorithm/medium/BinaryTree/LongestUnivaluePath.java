package Algorithm.medium.BinaryTree;

/**
 * int ans = Integer.MIN_VALUE;
 *     public int maxPathSum(TreeNode root) {
 *        if(root ==null) return Integer.MIN_VALUE;
 *         maxSum(root);
 *         return ans;
 *     }
 *     private int maxSum(TreeNode root){
 *         if(root==null) return Integer.MIN_VALUE;
 *         int left = Math.max(0,maxSum(root.left));
 *         int right = Math.max(0,maxSum(root.right));
 *         int sum = left+right+root.val;
 *         ans = Math.max(ans,sum);
 *         return Math.max(left,right)+root.val;
 *     }
 */
public class LongestUnivaluePath {
    int ans=0;
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int solution(TreeNode node){
        if(node ==null) return 0;
        univaluePath(node);
        return ans;

    }
    public int univaluePath(TreeNode root){
        if(root == null) return 0;
        int left = univaluePath(root.left);
        int right = univaluePath(root.right);
        int pl=0;
        int pr=0;
        if(root.left!=null&&root.val ==root.left.val) pl=left+1;
        if(root.right!=null&&root.val ==root.right.val) pr=right+1;
        ans = Math.max(ans,pl+pr);
        return Math.max(pl,pr);
    }
}
