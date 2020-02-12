package com.collection;

public class DynamicArrayForStudents
{
    private Student[] students;
    private int size;
    private int capacity;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
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
        setCapacity(10);      //let's assume default capacity = 10
        students = new Student[capacity];
        setSize(0);
    }

    public DynamicArrayForStudents(int capacity)
    {
        setCapacity(capacity);
        students = new Student[capacity]; //creates dynamic array with specified capacity
        setSize(0);
    }

    public int size()
    {
        return getSize();
    }

    public void add(Student s)
    {
        if(size >= capacity * 0.75){
            Student[] newStudents = new Student[ 2 * capacity ];
            setCapacity( 2 * capacity);
            copyArray(students, newStudents);
            newStudents[size]=s;
            size++;
        }
        else{
            students[size] = s;
            size ++;
        }
    }

    public void remove(Student s)
    {
        Student removableStudent = null;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getFirstName().compareTo(s.getFirstName())==0 && students[i].getLastName().compareTo(s.getLastName())==0 &&
                    students[i].getAge()==s.getAge()) {
                removableStudent = students[i];
                students[i]=null;
                for (int j = i; j <students.length; j++) {
                    students[j-1]=students[j];
                }
                size--;
                break;
            }
        }
        if(removableStudent == null)
            System.out.println("such student is not found in dynamic array");
    }

    private static  void copyArray (Student[] oldArray, Student[] newArray)
    {
        if(newArray.length >= oldArray.length) {
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
        }
    }

    public static void print(DynamicArrayForStudents students)
    {
       Student[] studentsNew = students.getStudents();

        for (Student s: studentsNew) {
            System.out.printf("Name: %10s %12s   Age: %2d\n", s.getFirstName(), s.getLastName(), s.getAge());
        }
    }

    public Student get(int index)
    {
        Student[] arrayOfStudents = students;
        if(arrayOfStudents[index]!=null)
            return arrayOfStudents[index];
        else
            return null;
    }
}
