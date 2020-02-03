package com.Maps;

import java.util.*;

public class Faculty
{

    public static void main(String[] args) {

        ArrayList<Student> studentsArray = initArrayList();
        HashMap<String, Integer> studentCountInFaculty = getFacultyCount(studentsArray);
        displayMap(studentCountInFaculty);
    }

    private static ArrayList<Student> initArrayList()
    {
            ArrayList<Student> studentsList = new ArrayList<>();
            studentsList.add(new Student("Diana", "Asatryan", 22, "0988111111" , "Math"));
            studentsList.add(new Student("Diana",  "Asatryan", 32, "0922111111", "Physics"));
            studentsList.add(new Student("Diana", "Asatryan", 21, "0938111111", "Philosophy"));
            studentsList.add(new Student("Karen", "Balayan", 12, "097777777", "Math"));
            studentsList.add(new Student("Karen", "Balayan", 23, "098888811", "Philosophy"));
            studentsList.add(new Student("Elen",  "Mirzoyan", 12, "093333333", "English"));

            return studentsList;
    }

    public static HashMap<String, Integer> getFacultyCount(ArrayList<Student> students)
    {
        HashMap<String, Integer> studentsCountInFaculty = new HashMap<>();
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext())
        {
            Student student = iterator.next();
            String faculty = student.getFaculty();
            if(!studentsCountInFaculty.containsKey(faculty))
            {
                studentsCountInFaculty.put(faculty, 1);
            }
            else
            {
                studentsCountInFaculty.put(faculty, studentsCountInFaculty.get(faculty)+1);
            }
        }

        return studentsCountInFaculty;
    }
    private static void displayMap(Map<String, Integer> map)
    {
        Set<String> keys = map.keySet();

        for(String key : keys)
        {
            System.out.printf("%-20s%2s\n", key, map.get(key));
        }
        //System.out.printf("Map size is: %d\nMap is empty: %b\n", map.size(), map.isEmpty());
    }


}
