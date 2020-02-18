package com.SetImplementation;

public class BinarySearchTree {
    class Node {
        Object data;
        Node left;
        Node right;

        public Node() {
            this(null, null, null);
        }

        public Node(Comparable data) {
            this(data, null, null);
        }

        public Node(Comparable data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Comparable getData() {
            return (Comparable) data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }


    private static Node rootOfBST;

    public BinarySearchTree() {
        rootOfBST = null;
    }

    public static Node getRootOfBST() {
        return rootOfBST;
    }

    public static void setRootOfBST(Node rootOfBST) {
        BinarySearchTree.rootOfBST = rootOfBST;
    }


    private Node insertNode(Node root, Comparable data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data.compareTo(root.getData()) > 0) {
            root.setRight(insertNode(root.getRight(), data));
        } else if (data.compareTo(root.getData()) < 0) {
            root.setLeft(insertNode(root.getLeft(), data));
        }
        return root;
    }

    public void add(Comparable data) {
        rootOfBST = insertNode(rootOfBST, data);
    }


    private Node containsData(Node root, Comparable data) {
        if (root == null || data.compareTo(root.getData())==0)
            return root;
        if (data.compareTo(root.getData()) < 0)
            return containsData(root.getLeft(), data);
        else
            return containsData(root.getRight(), data);
    }

    public void contains(Comparable data) {
        System.out.println((containsData(rootOfBST, data) == null ? "Set does not contain " + data.toString() : "Set contains " + data.toString()));
    }


    private static void inorderTraversalHelper(Node root) {
        if (root != null) {
            inorderTraversalHelper(root.getLeft());
            System.out.printf("%s\n", root.getData().toString());
            inorderTraversalHelper(root.getRight());
        }
    }

    public void inorderTraversal() {
        inorderTraversalHelper(rootOfBST);
    }


    private Node deleteNode(Node root, Comparable data) {
        if (root == null)
            return root;

        if (data.compareTo(root.getData()) > 0)
            root.setRight(deleteNode(root.getRight(), data));
        else if (data.compareTo(root.getData()) < 0)
            root.setLeft(deleteNode(root.getLeft(), data));
        else {
            if (root.getLeft() == null)
                return root.getRight();
            else if (root.getRight() == null)
                return root.getLeft();
            else {
                root.setData(findMinInRightSubtree(root.getRight()));
                root.setRight(deleteNode(root.getRight(), root.getData()));
            }
        }
        return root;
    }

    private Comparable findMinInRightSubtree(Node root) {
        Comparable min = root.getData();
        while (root.getLeft() != null) {
            min = root.getLeft().getData();
            root.setData(root.getLeft());
        }
        return min;
    }

    public void remove(Comparable data) {
        rootOfBST = deleteNode(rootOfBST, data);
    }

    public int getSize(Node root) {
        if(root==null)
            return 0;
        return 1 + getSize(root.getLeft()) + getSize(root.getRight());
    }

}
