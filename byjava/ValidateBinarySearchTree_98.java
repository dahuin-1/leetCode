package byjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree_98 {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;

        while(currentNode != null || !stack.empty()){
            while(currentNode != null){
                stack.add(currentNode);
               // TreeNode left = currentNode.left;
                if(currentNode.val < currentNode.left.val) {
                    return false;
                }
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            currentNode = currentNode.right;
        }
        return stack.isEmpty();
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
