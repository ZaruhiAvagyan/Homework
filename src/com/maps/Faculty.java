package com.maps;

public enum Faculty {

    MATH("Math"),
    PHYSICS("Physics"),
    PHILOSOPHY("Philosophy"),
    ENGLISH("English");

    private String facultyName;
    Faculty(String facultyName)
    {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
