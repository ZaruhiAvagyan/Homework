package com.Maps;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class mapFromArrayList
{

    public static void main(String[] args) {

        ArrayList<Student> studentsArray = initArrayList();
        HashMap<Student, Integer> studentsMapInstance = createMap(studentsArray);
        displayMap(studentsMapInstance);
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


    public static HashMap<Student, Integer> createMap(ArrayList<Student> students)
    {
        HashMap<Student, Integer> studentsMap = new HashMap<>();
        Iterator<Student> iterator  = students.iterator();
        int count = 1;
        while(iterator.hasNext())
        {
            Student student = iterator.next();

            if(!studentsMap.containsKey(student))
            {
                studentsMap.put(student, 1);
            }
            else
            {
                studentsMap.put(student, studentsMap.get(student)+1 );
            }
        }
        return studentsMap;
    }

    private static void displayMap(Map <Student, Integer> map)
    {
        Set <Student> keys = map.keySet();

        for(Student key : keys)
        {
            System.out.printf("%-20s%2s\n", key, map.get(key));
        }
        //System.out.printf("Map size is: %d\nMap is empty: %b\n", map.size(), map.isEmpty());
    }

}
