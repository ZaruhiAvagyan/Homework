package com.set;

public class BinarySearchTree<T extends Comparable<T>> {
    class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node() {
            this(null, null, null);
        }

        public Node(T data) {
            this(data, null, null);
        }

        public Node(T data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }


    private Node<T> rootOfBST;

    public BinarySearchTree() {
        rootOfBST = null;
    }

    public Node<T> getRootOfBST() {
        return rootOfBST;
    }

    public void setRootOfBST(Node<T> rootOfBST) {
        this.rootOfBST = rootOfBST;
    }


    private Node<T> insertNode(Node<T> root, T data) {
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

    public void add(T data) {
        rootOfBST = insertNode(rootOfBST, data);
    }


    private Node<T> containsData(Node<T> root, T data) {
        if (root == null || data.compareTo(root.getData())==0)
            return root;
        if (data.compareTo(root.getData()) < 0)
            return containsData(root.getLeft(), data);
        else
            return containsData(root.getRight(), data);
    }

    public void contains(T data) {
        System.out.println((containsData(rootOfBST, data) == null ? "Set does not contain " + data.toString() : "Set contains " + data.toString()));
    }


    private void inorderTraversalHelper(Node<T> root) {
        if (root != null) {
            inorderTraversalHelper(root.getLeft());
            System.out.printf("%s\n", root.getData().toString());
            inorderTraversalHelper(root.getRight());
        }
    }

    public void inorderTraversal() {
        inorderTraversalHelper(rootOfBST);
    }


    private Node<T> deleteNode(Node<T> root, T data) {
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

    private T findMinInRightSubtree(Node<T> root) {
        T min = root.getData();
        while (root.getLeft() != null) {
            min = root.getLeft().getData();
            root.setData((T) root.getLeft());
        }
        return min;
    }

    public void remove(T data) {
        rootOfBST = deleteNode(rootOfBST, data);
    }

    public int getSize(Node<T> root) {
        if(root==null)
            return 0;
        return 1 + getSize(root.getLeft()) + getSize(root.getRight());
    }

}
