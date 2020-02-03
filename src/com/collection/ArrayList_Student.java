import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Student
{

    public static void main(String[] args) {
        ArrayList<Student> students = init_Students();
        print(students);

        System.out.println("After using Comparator for sorting by firstName in ascending order");
        Collections.sort(students, new StudentComparator_byFirstName_ascendingOrder());
        print(students);

//        System.out.println("After using Comparator for sorting by Age in descending order");
//        Collections.sort(students, new StudentComparator_byAge_descendingOrder());
//        print(students);


    }

        private static ArrayList<Student> init_Students() {
            Student student1 = new Student("Mary", "Manukyan", 20);
            Student student2 = new Student("Ashot", "Sargsyan", 25);
            Student student3 = new Student("Susanna", "Gasparyan", 19);
            Student student4 = new Student("Vahagn", "Harutyunyan", 21);
            Student student5 = new Student("Vahagn", "Harutyunyan", 30);

            ArrayList<Student> students = new ArrayList<Student>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);

            return students;
        }

        private static void print(ArrayList<Student> arrayList)
        {
            for(Student student : arrayList)
                System.out.printf("Name: %10s %12s   Age: %2d\n", student.getFirstName(), student.getLastName(), student.getAge());
            System.out.println();
        }

}
