package com.epam.university;

public class Student
{
    private String firstName;
    private String lastName;
    private int id;
    private String[] courses;
    private int[] grades;


    public Student(int id, String firstName, String lastName, String[] courses, int[] grades)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.courses=courses;
        this.grades=grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }


    // Average grade for a particular student
    public static double getAverageGradeOfOneStudent(int[] grades)
    {
        int total=0;
        double average=0.0;
        for (int i = 0; i < grades.length; i++) {
            total+=grades[i];
        }
        average=(double)total/grades.length;
        return average;
    }// end getAverageGradeOfOneStudent



}
