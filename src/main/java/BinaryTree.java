class TreeNode {
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
  }
public class BinaryTree {
    public static void main(String[] args) {

    }
    public static boolean CheckTree(TreeNode root)
    {
        if(root==null)
            return true;
        else
            return CheckNodes(root.left, root.right);
    }
    public static boolean CheckNodes(TreeNode n1, TreeNode n2)
    {
        if(n1==null && n2==null)
            return true;
        if(n1==null || n2==null)
            return false;
        else if(n1.val!=n2.val)
            return false;
        return n1.val==n2.val && CheckNodes(n1.left, n2.right) && CheckNodes(n1.right, n2.left);
    }
}
