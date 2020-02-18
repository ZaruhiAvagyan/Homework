package com.collection;

public class DynamicArrayForStudents
{
    private ComparableStudent[] students;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;

    public ComparableStudent[] getStudents() {
        return students;
    }

    public void setStudents(ComparableStudent[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public DynamicArrayForStudents()
    {
        setCapacity(DEFAULT_CAPACITY);
        students = new ComparableStudent[capacity];
        setSize(0);
    }

    public DynamicArrayForStudents(int capacity)
    {
        setCapacity(capacity);
        students = new ComparableStudent[capacity]; //creates dynamic array with specified capacity
        setSize(0);
    }

    public int size()
    {
        return getSize();
    }

    public void add(ComparableStudent s) throws IllegalArgumentException
    {
        if(s == null){
            throw new IllegalArgumentException("Argument should not be null");
        }
        else if(getSize() == getCapacity()){
            ComparableStudent[] newStudents = new ComparableStudent[ 2 * getCapacity() ];
            setCapacity( 2 * getCapacity());
            copyArray(students, newStudents);
            students = newStudents;
            newStudents[size]=s;
            setSize(size + 1);
        }
        else if(getSize() < getCapacity()){
            students[size] = s;
            setSize(size + 1);
        }
    }

    public void remove(ComparableStudent s) throws IllegalArgumentException
    {
        if(s == null){
            throw new IllegalArgumentException("Argument should not be null");
        }
        ComparableStudent removableStudent = null;
        for (int i = 0; i < getSize(); i++) {
            if(students[i].equals(s)) {
                removableStudent = students[i];
                students[i]=null;
                for (int j = i + 1; j < getSize(); j++) {
                    students[j-1]=students[j];
                }
                size--;
                System.out.println("Student is removed.");
            }
            if(removableStudent != null) {
                break;
            }
        }
        if(removableStudent == null) {
            System.out.println("such student is not found in dynamic array");
        }
    }

    private static  void copyArray (ComparableStudent[] oldArray, ComparableStudent[] newArray)
    {
        if(newArray.length >= oldArray.length) {
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
        }
    }

    public static void print(DynamicArrayForStudents students)
    {
        System.out.println();
        if(students.getSize() != 0) {
            ComparableStudent[] studentsNew = students.getStudents();
            for (int i = 0; i < students.getSize(); i++) {
                System.out.println(studentsNew[i].toString());
            }
        }else{
            System.out.println("Array is empty");
        }
        System.out.println();
    }

    public ComparableStudent get(int index) throws IllegalArgumentException
    {
        ComparableStudent[] arrayOfStudents = students;
        if(index >= arrayOfStudents.length){
            throw new IllegalArgumentException("The index is out of range.");
        }else {
            System.out.printf("The student name at index %d is %s\n", index, arrayOfStudents[index].getFirstName());
            return arrayOfStudents[index];
        }
    }
}
