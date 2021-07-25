package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrder_sol {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        travel(root, resultList, 0);
        return resultList;
    }

    private void travel(TreeNode currentNode, List<List<Integer>> resultList, int level) {
        if(currentNode == null) return;

        if(resultList.size() <= level) {
            List<Integer> newLevel = new LinkedList<>();
            resultList.add(newLevel);
        }

        List<Integer> collection  = resultList.get(level);
        if(level % 2 == 0) collection.add(currentNode.val);
        else collection.add(0, currentNode.val);

        travel(currentNode.left, resultList, level + 1);
        travel(currentNode.right, resultList, level + 1);
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

