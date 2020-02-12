package com.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudent
{
    public static void main(String[] args) {

        LinkedList<ComparableStudent> comparableStudents = initComparableStudents();
        printStudents(comparableStudents);
        Collections.sort(comparableStudents);
        System.out.println("After sorting by lastName in ascending order: ");
        printStudents(comparableStudents);
    }

    private static void printStudents(LinkedList<ComparableStudent> comparableStudents) {
        Iterator<ComparableStudent> iterator = comparableStudents.iterator();
        while(iterator.hasNext())
        {
            ComparableStudent temp = iterator.next();
            System.out.printf("Name: %10s %12s   Age: %2d\n", temp.getFirstName(), temp.getLastName(), temp.getAge());
        }
        System.out.println();
    }

    private static LinkedList<ComparableStudent> initComparableStudents() {

        LinkedList<ComparableStudent> comparableStudents = new LinkedList<>();
        comparableStudents.add(new ComparableStudent("Mary", "Manukyan", 20));
        comparableStudents.add(new ComparableStudent("Ashot", "Sargsyan", 25));
        comparableStudents.add(new ComparableStudent("Susanna", "Gasparyan", 19));
        comparableStudents.add(new ComparableStudent("Vahagn", "Harutyunyan", 21));

        return comparableStudents;
    }
}
