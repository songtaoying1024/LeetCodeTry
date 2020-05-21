package Algorithm.medium.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 655 LeetCode
 */
public class PrintBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        int width = (1<<height)-1;

        List<List<String>> ans = new ArrayList<>(height);
        List<String> res = new ArrayList<>(width);
        
        for (int i = 0; i < height; i++) {
            List<String> list = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                list.add("");
            }
            ans.add(list);
        }
        fill(root,ans,0,0,width-1);
        for(int i =0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+ "  ");
            }
            System.out.println("\n");
        }
        return ans;
    }
    public int getHeight (TreeNode root){
        if(root ==null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public void fill(TreeNode root, List<List<String>> ans,int h,int l,int r){
        if(root==null) return;
        int mid = (l+r)/2;
        ans.get(h).set(mid,String.valueOf(root.val));
        fill(root.left,ans,h+1,l,mid-1);
        fill(root.right,ans,h+1,mid+1,r);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        new PrintBinaryTree().printTree(t1);
    }
}
