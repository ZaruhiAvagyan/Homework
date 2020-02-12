package com.collection;

public class DynamicArrayTest
{
    public static void main(String[] args) {
        DynamicArrayForStudents studentsDynamic = new DynamicArrayForStudents(7);

        studentsDynamic.add(new Student("Mary", "Manukyan", 20));
        studentsDynamic.add(new Student("Ashot", "Sargsyan", 25));
        studentsDynamic.add(new Student("Susanna", "Gasparyan", 19));
        studentsDynamic.add(new Student("Vahagn", "Harutyunyan", 21));

        System.out.println(studentsDynamic.getSize());
        System.out.println(studentsDynamic.getCapacity());

        //Get the firstName of Student at index=2
        Student studentUsingGet = studentsDynamic.get(2);
        System.out.println(studentUsingGet.getFirstName());
    }
}
