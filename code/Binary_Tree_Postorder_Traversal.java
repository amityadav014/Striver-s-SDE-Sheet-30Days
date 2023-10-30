//problem link : https://leetcode.com/problems/binary-tree-preorder-traversal/



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
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    if (root == null) {
      return result;
    }

    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      result.add(0, node.val); // Add the node value at the beginning of the list

      // Push the left child first, then the right child
      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    // Example usage
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);

    List<Integer> result = solution.postorderTraversal(root);
    System.out.println(result);  // Output: [3, 2, 1]
  }
}





