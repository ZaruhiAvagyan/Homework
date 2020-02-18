package com.collection;

public class Test
{
    public static void main(String[] args) {
        checkDynamicArray();
        System.out.println("\n********** End of checking Dynamic Array! **********");
        System.out.println("******** Start checking Doubly Linked List! ********\n");
        checkDoublyLinkedList();
    }

    private static void checkDoublyLinkedList() {

        DoublyLinkedList studentsList = new DoublyLinkedList();

        //push
        studentsList.push(new ComparableStudent("Mary", "Manukyan", 20));
        studentsList.push(new ComparableStudent("Ashot", "Sargsyan", 25));
        studentsList.push(new ComparableStudent("Susanna", "Gasparyan", 19));
        try {
            studentsList.push(null);
        }catch(IllegalArgumentException e){}
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size());

        //pop
        ComparableStudent popped = studentsList.pop();
        System.out.printf("\nThe popped student is %s\n", popped.toString());
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size() + "\n");

        //addLast
        studentsList.addLast(new ComparableStudent("Vahagn", "Harutyunyan", 21));
        System.out.println("Student is added on the last index");
        try{
            studentsList.addLast(null);
        }catch(IllegalArgumentException e){}
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size());

        //removeLast
        ComparableStudent removeLast = studentsList.removeLast();
        System.out.printf("\nThe removed last student is %s\n", removeLast.toString());
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size() + "\n");

    }

    private  static void checkDynamicArray(){

        DynamicArrayForStudents studentsDynamic = new DynamicArrayForStudents(7);

        //add
        studentsDynamic.add(new ComparableStudent("Mary", "Manukyan", 20));
        studentsDynamic.add(new ComparableStudent("Ashot", "Sargsyan", 25));
        try{
            studentsDynamic.add(null);
        }catch(IllegalArgumentException e){}
        studentsDynamic.add(new ComparableStudent("Susanna", "Gasparyan", 19));
        studentsDynamic.add(new ComparableStudent("Vahagn", "Harutyunyan", 21));


        System.out.printf("Array size is %d\n", studentsDynamic.getSize());
        System.out.printf("Array capacity is %d\n", studentsDynamic.getCapacity());
        DynamicArrayForStudents.print(studentsDynamic);

        //remove
        studentsDynamic.remove(new ComparableStudent("Susanna", "Gasparyan", 19));
        try{
            studentsDynamic.remove(null);
        }catch(IllegalArgumentException e){}

        System.out.printf("Array size is %d\n", studentsDynamic.getSize());
        System.out.printf("Array capacity is %d\n", studentsDynamic.getCapacity());
        DynamicArrayForStudents.print(studentsDynamic);
        System.out.println();

        //Get the firstName of Student at index=1
        ComparableStudent student1 = studentsDynamic.get(1);
        try{
            ComparableStudent student2 = studentsDynamic.get(100);
        }catch(IllegalArgumentException e){}
    }

}
