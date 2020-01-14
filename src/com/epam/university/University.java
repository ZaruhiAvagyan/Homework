package com.epam.university;

public class University
{
    private String universityName;
    private Faculty[] facultiesInUniversity;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Faculty[] getFacultiesInUniversity() {
        return facultiesInUniversity;
    }

    public void setFacultiesInUniversity(Faculty[] facultiesInUniversity) {
        this.facultiesInUniversity = facultiesInUniversity;
    }
}
