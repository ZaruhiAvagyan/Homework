package com.SetImplementation;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        checkStudentsSet();
        System.out.println();
        checkCoffeeSet();
        System.out.println();
        checkGlassesSet();
        System.out.println();
    }

    public static void checkStudentsSet() {

        StudentComparable s1 = new StudentComparable("A", "B", 19);
        StudentComparable s2 = new StudentComparable("K", "B", 7);
        StudentComparable s3 = new StudentComparable("F", "A", 8);
        StudentComparable s4 = new StudentComparable("A", "B", 17);
        StudentComparable s5 = new StudentComparable("E", "C", 14);

        BinarySearchTree studentsSet = new BinarySearchTree();

        studentsSet.add(s1);
        studentsSet.add(s2);
        studentsSet.add(s3);
        studentsSet.add(s4);
        studentsSet.add(s5);
        studentsSet.inorderTraversal();
        System.out.println("After removing an element");
        studentsSet.remove(s3);
        studentsSet.inorderTraversal();

        BinarySearchTree.Node rootTest = BinarySearchTree.getRootOfBST();
        System.out.printf("The number of elements is %d\n", studentsSet.getSize(rootTest));
        studentsSet.contains(new StudentComparable("A", "K", 7));
        studentsSet.contains(new StudentComparable("E", "C", 14));
    }

    public static void checkCoffeeSet()
    {
        CoffeeComparable c1 = new CoffeeComparable(3);
        CoffeeComparable c2 = new CoffeeComparable(2);
        CoffeeComparable c3 = new CoffeeComparable(5);
        CoffeeComparable c4 = new CoffeeComparable(1);

        BinarySearchTree coffeeSet = new BinarySearchTree();
        coffeeSet.add(c1);
        coffeeSet.add(c2);
        coffeeSet.add(c3);
        coffeeSet.add(c4);
        coffeeSet.inorderTraversal();
        System.out.println("After removing an element");
        coffeeSet.remove(c3);
        coffeeSet.inorderTraversal();

        BinarySearchTree.Node rootTest = BinarySearchTree.getRootOfBST();
        System.out.printf("The number of elements is %d\n", coffeeSet.getSize(rootTest));
        coffeeSet.contains(new CoffeeComparable(3));
        coffeeSet.contains(new CoffeeComparable(4));
    }

    private static void checkGlassesSet() {
        BinarySearchTree glassesSet = new BinarySearchTree();
        glassesSet.add(new GlassesComparable(160.55));
        glassesSet.add(new GlassesComparable(50.21));
        glassesSet.add(new GlassesComparable(180.30));
        glassesSet.add(new GlassesComparable(25.48));
        glassesSet.inorderTraversal();
        System.out.println("After removing an element");
        glassesSet.remove(new GlassesComparable(160.55));
        glassesSet.inorderTraversal();

        BinarySearchTree.Node rootTest = BinarySearchTree.getRootOfBST();
        System.out.printf("The number of elements is %d\n", glassesSet.getSize(rootTest));
        glassesSet.contains(new GlassesComparable(50.21));
        glassesSet.contains(new GlassesComparable(28.90));
    }
}