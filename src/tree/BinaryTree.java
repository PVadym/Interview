package tree;

import practice_test.src.BynaryTree.Node;

/**
 * Created by Вадим on 27.04.2017.
 */
public class BinaryTree {

    static class TreeNode {
        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }
    }
    TreeNode root;

    /**
     * * traverse the binary tree on post order traversal algorithm */

    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        postOrder(node.left);
        postOrder(node.right);

    }
    /** * Java method to create binary tree with test data * * @return a sample binary tree for testing */
    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode("55");
        tree.root = root;
        tree.root.left = new TreeNode("35");
        tree.root.left.left = new TreeNode("25");
        tree.root.left.left.left = new TreeNode("15");
        tree.root.left.right = new TreeNode("45");
        tree.root.right = new TreeNode("65");
        tree.root.right.right = new TreeNode("75");
        tree.root.right.right.left = new TreeNode("87");
        tree.root.right.right.right = new TreeNode("98");
        return tree;
    }

    public  static void insert(Node root, int data){
    }
}



