package Algorithm.medium.BinaryTree;

public class BInaryTreeMaximumPathSum {
    int ans = Integer.MIN_VALUE;
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int maxPathSum(TreeNode root) {
        if(root ==null) return Integer.MIN_VALUE;
        maxSum(root);
        return ans;
    }
    private int maxSum(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int left = Math.max(0,maxSum(root.left));
        int right = Math.max(0,maxSum(root.right));
        int sum = left+right+root.val;
        ans = Math.max(ans,sum);
        /** 返回的是经过根的最大值*/
        return Math.max(left,right)+root.val;
    }
}
