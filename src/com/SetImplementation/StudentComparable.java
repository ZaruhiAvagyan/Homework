package com.SetImplementation;

public class StudentComparable implements Comparable<StudentComparable> {

    private String firstName;
    private String lastName;
    private int age;

    public StudentComparable(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(StudentComparable o) {
        String tempFirstName = o.getFirstName();
        String tempLastName = o.getLastName();
        int tempAge = o.getAge();
        if(this.getFirstName()==tempFirstName){
            if(this.getLastName()==tempLastName){
                return (this.getAge()==tempAge ? 0 : ((this.getAge() > tempAge) ? 1 : -1));
            }
            else
                return (this.getLastName().compareTo(tempLastName)<0 ? -1 : 1);
        }
        else
            return (this.getFirstName().compareTo(tempFirstName)>0 ? 1 : -1);
    }

    @Override
    public String toString() {
        return  "Student : " + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }
}
