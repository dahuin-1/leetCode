package byjava;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode a = root;

        if(a != null || !stack.empty()){
            while(a != null) {
                stack.add(a);
                a = a.left;
            }
            a = stack.pop();
            result.add(a.val);
            a = a.right;
        }
        return result;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
