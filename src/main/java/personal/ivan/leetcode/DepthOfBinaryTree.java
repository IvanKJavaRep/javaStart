package personal.ivan.leetcode;

public class DepthOfBinaryTree {
    public static void main(String[] args) {
        //isBalanced();
    }
    public static int isBalanced(TreeNode root) {
        int levelleft =1;
        int levelright =1;
        levelleft+=isBalancedHelper(root.left.left, root.left.right,levelleft);
        levelright+=isBalancedHelper(root.right.left, root.right.right,levelright);
        return Math.max(levelleft,levelright);
    }

    private static  int isBalancedHelper(TreeNode root1, TreeNode root2, int level){
        if (root1 != null || root2!=null) {
            return isBalancedHelper(root1.left, root1.right, level + 1);
        }
        else
        {
            return level;
        }
    }
}
/*
class personal.ivan.TreeNode {
      int val;
      personal.ivan.TreeNode left;
      personal.ivan.TreeNode right;
      personal.ivan.TreeNode() {}
      personal.ivan.TreeNode(int val) { this.val = val; }
      personal.ivan.TreeNode(int val, personal.ivan.TreeNode left, personal.ivan.TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
*/
