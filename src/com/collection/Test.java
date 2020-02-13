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
        studentsList.push(new ComparableStudent("Mary", "Manukyan", 20));
        studentsList.push(new ComparableStudent("Ashot", "Sargsyan", 25));
        studentsList.push(new ComparableStudent("Susanna", "Gasparyan", 19));
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size());

        ComparableStudent popped = studentsList.pop();
        System.out.printf("\nThe popped student is %s\n", popped.toString());
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size() + "\n");

        studentsList.addLast(new ComparableStudent("Vahagn", "Harutyunyan", 21));
        System.out.println("Student is added on the last index");
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size());

        ComparableStudent removeLast = studentsList.removeLast();
        System.out.printf("\nThe removed last student is %s\n", removeLast.toString());
        DoublyLinkedList.print(studentsList);
        System.out.println("Size = " + studentsList.size() + "\n");

    }

    private  static void checkDynamicArray(){

        DynamicArrayForStudents studentsDynamic = new DynamicArrayForStudents(7);
        studentsDynamic.add(new ComparableStudent("Mary", "Manukyan", 20));
        studentsDynamic.add(new ComparableStudent("Ashot", "Sargsyan", 25));
        studentsDynamic.add(new ComparableStudent("Susanna", "Gasparyan", 19));
        studentsDynamic.add(new ComparableStudent("Vahagn", "Harutyunyan", 21));

        System.out.printf("Array size is %d\n", studentsDynamic.getSize());
        System.out.printf("Array capacity is %d\n", studentsDynamic.getCapacity());
        DynamicArrayForStudents.print(studentsDynamic);

        try {
            studentsDynamic.remove(new ComparableStudent("Vahagn", "Harutyunyan", 21));
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.printf("Array size is %d\n", studentsDynamic.getSize());
        System.out.printf("Array capacity is %d\n", studentsDynamic.getCapacity());
        DynamicArrayForStudents.print(studentsDynamic);
        System.out.println();

        //Get the firstName of Student at index=1
        try {
            ComparableStudent student = studentsDynamic.get(1);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

}
