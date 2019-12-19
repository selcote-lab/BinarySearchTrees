package com.tonasolution;

public class Tree {

    private TreeNode root;

    public void insert(int value){

        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {

        if (root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value) {

        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {

        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));
        }
        else {
            // == Case 0 and 1 = node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight();
            }
            else if (subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft();
            }
        }
        return subtreeRoot;
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

}
