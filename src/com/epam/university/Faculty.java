package com.epam.university;

public class Faculty
{
    private String facultyName;
    private Group[] groupsInFaculty;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Group[] getGroupsInFaculty() {
        return groupsInFaculty;
    }

    public void setGroupsInFaculty(Group[] groupsInFaculty) {
        this.groupsInFaculty = groupsInFaculty;
    }


    public static double[] averageForFaculty(Faculty faculty)
    {
        Group[] groups = faculty.getGroupsInFaculty();
        double[] averagesOfFaculty=new double[Group.courses.length];

        for (int i = 0; i < groups.length; i++) {
            double avg[] = Group.averageOfSubjectsInGroup(groups[i]);
            for (int j = 0; j < averagesOfFaculty.length; j++) {
                averagesOfFaculty[j] += avg[j];
            }
        }

        for (int i = 0; i < averagesOfFaculty.length; i++) {
            averagesOfFaculty[i]/=groups.length;
        }

        return averagesOfFaculty;
    }
}
