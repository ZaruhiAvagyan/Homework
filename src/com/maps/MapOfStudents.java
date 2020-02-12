package com.maps;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class MapOfStudents
{
    public static void main(String[] args) {
        ArrayList<Student> studentsArray = initArrayList();
        HashMap<Student, Integer> studentsMapInstance = createMap(studentsArray);
        displayMap(studentsMapInstance);
    }

    static ArrayList<Student> initArrayList()
    {
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Diana", "Asatryan", 22, "0988111111" , Faculty.MATH));
        studentsList.add(new Student("Diana",  "Asatryan", 32, "0922111111", Faculty.PHYSICS));
        studentsList.add(new Student("Diana", "Asatryan", 21, "0938111111", Faculty.PHILOSOPHY));
        studentsList.add(new Student("Karen", "Balayan", 12, "097777777", Faculty.MATH));
        studentsList.add(new Student("Karen", "Balayan", 23, "098888811", Faculty.PHILOSOPHY));
        studentsList.add(new Student("Elen",  "Mirzoyan", 12, "093333333", Faculty.ENGLISH));

        return studentsList;
    }

    public static HashMap<Student, Integer> createMap(ArrayList<Student> students)
    {
        HashMap<Student, Integer> studentsMap = new HashMap<>();
       for(Student student : students)
       {
           if(!studentsMap.containsKey(student)) {
               studentsMap.put(student, 1);
           }else{
               studentsMap.put(student, studentsMap.get(student)+1 );
           }
       }
       return studentsMap;
    }

    private static void displayMap(Map <Student, Integer> map)
    {
        for(Map.Entry<Student, Integer> entry : map.entrySet())
            System.out.printf("%-20s%2s\n", entry.getKey(), entry.getValue());
    }
}
