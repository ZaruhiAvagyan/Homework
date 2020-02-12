package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfStudents
{
    public static void main(String[] args) {
        ArrayList<Student> students = initStudents();
        print(students);

        System.out.println("After using Comparator for sorting by firstName in ascending order and by age in descending order");
        Collections.sort(students, new StudentComparator());
        print(students);
    }

        private static ArrayList<Student> initStudents() {

            ArrayList<Student> students = new ArrayList<Student>();
            students.add(new Student("Mary", "Manukyan", 20));
            students.add(new Student("Ashot", "Sargsyan", 25));
            students.add(new Student("Susanna", "Gasparyan", 19));
            students.add(new Student("Vahagn", "Harutyunyan", 21));
            students.add(new Student("Vahagn", "Harutyunyan", 30));

            return students;
        }

        private static void print(ArrayList<Student> arrayList)
        {
            for(Student student : arrayList)
                System.out.printf("Name: %10s %12s   Age: %2d\n", student.getFirstName(), student.getLastName(), student.getAge());
            System.out.println();
        }
}
