package com.epam.university;

import java.util.Arrays;

public class Group
{
    private Student[] studentsInGroup=new Student[3];
    private String groupName;
    static String[] courses = new String[] {"Accounting", "Math", "English", "Art","History", "Marketing", "Music", "Literature"};

    public Group(String name)
    {
        groupName=name;
    }


    public void setStudentsInGroup(Student[] studentsInGroup) {
        this.studentsInGroup = studentsInGroup;
    }

    public Student[] getStudentsInGroup() {
        return studentsInGroup;
    }


    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }


    //Get average grade of every subject in a particular group

    public static double[] averageOfSubjectsInGroup(Group group)
    {
        // indices counting how many students in a group have the particular course
        int accountingCount=0;
        int mathCount=0;
        int englishCount=0;
        int artCount=0;
        int historyCount=0;
        int marketingCount=0;
        int musicCount=0;
        int literatureCount=0;

        int totalAccounting=0;
        int totalMath=0;
        int totalEnglish=0;
        int totalArt=0;
        int totalHistory=0;
        int totalMarketing=0;
        int totalMusic=0;
        int totalLiterature=0;

        for (Student student : group.getStudentsInGroup()) {

            String[] arrayOfCourses =  student.getCourses();
            int[] arrayOfGrades = student.getGrades();


            for (int i = 0; i < arrayOfCourses.length; i++) {
                switch (arrayOfCourses[i])
                {
                    case "Accounting":
                        accountingCount++;
                        totalAccounting+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("Accounting")];
                    break;

                    case "Math":
                        mathCount++;
                        totalMath+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("Math")];
                        break;

                    case "English":
                        englishCount++;
                        totalEnglish+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("English")];
                        break;

                    case "Art":
                        artCount++;
                        totalArt+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("Art")];
                        break;

                    case "History":
                        historyCount++;
                        totalHistory+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("History")];
                        break;
                    case "Marketing":
                        marketingCount++;
                        totalMarketing+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("Marketing")];
                        break;

                    case "Music":
                        musicCount++;
                        totalMusic+= arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("Music")];
                        break;

                    case "Literature":
                        literatureCount++;
                        totalLiterature+=arrayOfGrades[Arrays.asList(arrayOfCourses).indexOf("Literature")];
                        break;
                } // end switch
            } // end for

        }


        double avgAccounting = (double)totalAccounting/accountingCount;
        double avgMath = (double)totalMath/mathCount;
        double avgEnglish = (double)totalEnglish/englishCount;
        double avgArt = (double)totalArt/artCount;
        double avgHistory = (double)totalHistory/historyCount;
        double avgMarketing = (double)totalMarketing/marketingCount;
        double avgMusic = (double)totalMusic/musicCount;
        double avgLiterature = (double)totalLiterature/literatureCount;

        double[] averages = new double[]{avgAccounting, avgMath, avgEnglish, avgArt, avgHistory, avgMarketing, avgMusic, avgLiterature};

        for (int i = 0; i < averages.length; i++) {
            if(averages[i]!=0)
            {
                System.out.printf("Average grade for %s is %.2f\n", courses[i], averages[i]);
            }
        }
        return averages;
    }


}

