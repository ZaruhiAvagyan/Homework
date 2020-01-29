import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Student
{
    public static void main(String[] args) {
        LinkedList<ComparableStudent> comparableStudents = initilizeComparableStudents();
        printStudents(comparableStudents);
        System.out.println();
        System.out.println("After sorting by lastName in ascending order: ");
        Collections.sort(comparableStudents);
        printStudents(comparableStudents);

    }

    private static void printStudents(LinkedList<ComparableStudent> comparableStudents) {
        Iterator<ComparableStudent> iterator = comparableStudents.iterator();
        while(iterator.hasNext())
        {
            ComparableStudent temp = iterator.next();
            System.out.printf("Name: %10s %12s   Age: %2d\n", temp.getFirstName(), temp.getLastName(), temp.getAge());
        }
    }

    private static LinkedList<ComparableStudent> initilizeComparableStudents() {
        LinkedList<ComparableStudent> comparableStudents = new LinkedList<>();

        ComparableStudent student1 = new ComparableStudent("Mary", "Manukyan", 20);
        ComparableStudent student2 = new ComparableStudent("Ashot", "Sargsyan", 25);
        ComparableStudent student3 = new ComparableStudent("Susanna", "Gasparyan", 19);
        ComparableStudent student4 = new ComparableStudent("Vahagn", "Harutyunyan", 21);

        comparableStudents.add(student1);
        comparableStudents.add(student2);
        comparableStudents.add(student3);
        comparableStudents.add(student4);
        return comparableStudents;
    }

}
