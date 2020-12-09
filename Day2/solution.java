import javax.swing.tree.TreeNode;

class Solution{

   public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }       
   }

   private int count = 0;

   public int countUnivalSubtree(TreeNode root) {
        countNode(root);
        return count;
   }

   private boolean countNode(TreeNode node) {
       if(node == null)
            return true;

        boolean left = countNode(node.left);
        boolean right = countNode(node.right);
        
        if(left && right) {
            if((node.left != null && node.left.val != node.val) ||
                (node.right != null && node.right.val != node.val))
                    return false;
            count++;
            return true;
        }

        return false;
   }

   
} 