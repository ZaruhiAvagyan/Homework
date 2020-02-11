package com.Maps;

import java.util.*;

public class MapOfFaculties
{
    public static void main(String[] args) {
        ArrayList<Student> studentsArray = MapOfStudents.initArrayList();
        HashMap<Faculty, Integer> studentCountInFaculty = getFacultyCount(studentsArray);
        displayMap(studentCountInFaculty);
    }

    public static HashMap<Faculty, Integer> getFacultyCount(ArrayList<Student> students)
    {
        HashMap<Faculty, Integer> studentsCountInFaculty = new HashMap<>();
        for (Student student : students)
        {
            Faculty faculty = student.getFaculty();
            if(!studentsCountInFaculty.containsKey(faculty)){
                studentsCountInFaculty.put(faculty, 1);
            }else{
                studentsCountInFaculty.put(faculty, studentsCountInFaculty.get(faculty)+1);
            }
        }
        return studentsCountInFaculty;
    }

    private static void displayMap(Map <Faculty, Integer> map)
    {
        for(Map.Entry<Faculty, Integer> entry : map.entrySet())
            System.out.printf("%-20s%2s\n", entry.getKey(), entry.getValue());
    }
}
