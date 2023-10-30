//problem link : https://leetcode.com/problems/binary-tree-inorder-traversal/description/


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }
      current = stack.pop();
      result.add(current.val);
      current = current.right;
    }

    return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    // Example usage
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);

    List<Integer> result = solution.inorderTraversal(root);
    System.out.println(result);  // Output: [1, 3, 2]
  }
}
