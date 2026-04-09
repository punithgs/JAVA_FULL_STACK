/*
257. Binary Tree Paths

Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
 

Constraints:

The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100

*/
public class Binary Tree Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<> ();
        dfs (root, "", result);
        return result;
    }

    public void dfs (TreeNode node, String path, List<String> result) {
        if(node == null) return;

        path += node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        dfs(node.left, path + "->", result);
        dfs(node.right, path + "->", result);
    }
}
