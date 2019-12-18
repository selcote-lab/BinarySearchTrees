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

    }

//    private TreeNode delete(TreeNode subtreeRoot, int value) {
//
//        if (subtreeRoot == null) {
//            return subtreeRoot;
//        }
//
//        if (value < subtreeRoot.getData()) {
//            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value));
//        }
//        else if (value > subtreeRoot.getData()) {
//            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));
//        }
//    }

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
