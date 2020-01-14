package com.epam.university;

public class Testing
{
    public static void main(String[] args) {

        //Create Students
        Student[] students = new Student[12];
        students[0] = new Student(1, "Gayane", "Martirosyan", new String[]{"Accounting", "Math", "English"}, new int[]{80, 98, 52});
        students[1] = new Student(2, "Mane", "Gevorgyan", new String[]{"English", "Art", "History"}, new int[]{78, 65, 90});
        students[2] = new Student(3, "Ashot", "Harutyunyan", new String[]{"Accounting", "Math", "English"}, new int[]{98, 70, 89});
        students[3] = new Student(4, "Davit", "Avagyan", new String[]{"Marketing", "Math", "History"}, new int[]{40, 67, 57});
        students[4] = new Student(5, "Marine", "Geghamyan", new String[]{"English", "Art", "History"}, new int[]{89, 70, 67});
        students[5] = new Student(6, "Lusine", "Mheryan", new String[]{"Marketing", "Math", "History"}, new int[]{49, 59, 48});
        students[6] = new Student(7, "Arevik", "Hovhannisyan", new String[]{"English", "Music", "Literature"}, new int[]{90, 78, 86});
        students[7] = new Student(8, "Arthur", "Gevorgyan", new String[]{"Accounting", "Math", "English"}, new int[]{90, 99, 100});
        students[8] = new Student(9, "Sona", "Ghazaryan", new String[]{"English", "Art", "History"}, new int[]{100, 89, 97});
        students[9] = new Student(10, "Maria", "Sargsyan", new String[]{"English", "Music", "Literature"}, new int[]{68, 70, 58});
        students[10] = new Student(11, "Edgar", "Sahakyan", new String[]{"Marketing", "Math", "History"}, new int[]{79, 81, 83});
        students[11] = new Student(12, "Lilit", "Harutyunyan", new String[]{"English", "Music", "Literature"}, new int[]{98, 96, 93});
        // Students are already created


        // Create groups
        Group[] groups = new Group[4];

        for (int i = 0; i < groups.length; i++) {
            groups[i]=new Group("Group " + (i+1));
        }

        for (int i = 0; i < students.length; i++) {
            switch (students[i].getId()) {
                case 1:
                case 2:
                case 7:
                    groups[0].setStudentsInGroup(new Student[]{students[1], students[2], students[7]});
                    break;
                case 3:
                case 5:
                case 11:
                    groups[1].setStudentsInGroup(new Student[]{students[3], students[5], students[11]});
                    break;
                case 0:
                case 4:
                case 10:
                    groups[2].setStudentsInGroup(new Student[]{students[0], students[4], students[10]});
                    break;
                case 6:
                case 8:
                case 9:
                    groups[3].setStudentsInGroup(new Student[]{students[6], students[8], students[9]});
                    break;
            }
        }  // end for
        // Groups are already created



        // Create Faculties
        Faculty[] faculties = new Faculty[2];
        for (int i = 0; i < faculties.length; i++) {
            faculties[i] =new Faculty("Faculty " + (i+1));
        }

        for (int i = 0; i < groups.length; i++) {
            switch(groups[i].getGroupName()){
                case "Group 1":
                case "Group 3":
                    faculties[0].setGroupsInFaculty(new Group[]{groups[0], groups[2]});
                    break;
                case "Group 2":
                case "Group 4":
                    faculties[1].setGroupsInFaculty(new Group[]{groups[1], groups[3]});
                    break;
            }
        }//end for
        // Faculties are already created

        //Create University
        University university = new University("AUA");
        university.setFacultiesInUniversity(faculties);
        // University is already created

        // Average grade for a particular student
        for (int i = 0; i < students.length; i++) {
            System.out.printf("The average grade for Student %d = %.2f\n", i+1, students[i].getAverageGradeOfOneStudent(students[i].getGrades()));
        }


        System.out.println();
        //Get average grade of every subject in a particular group
        for (int i = 0; i < groups.length; i++) {
            System.out.printf("Average grades for %s are the following\n\n", groups[i].getGroupName());
            Group.averageOfSubjectsInGroup(groups[i]);
            System.out.println();
        }

        System.out.println();
        //Get average grade of every subject in a faculty
        for (int i = 0; i < faculties.length ; i++) {
            System.out.printf("Average grades for %s are the following\n\n", faculties[i].getFacultyName());
            Faculty.averageForFaculty(faculties[i]);
            System.out.println();
        }


    } // end main



}// end class


