import java.util.Comparator;

public class StudentComparator_byFirstName_ascendingOrder implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        int result =o1.getFirstName().compareTo(o2.getFirstName());

        return (result==0 ? o2.getAge()-o1.getAge() : result );
    }

}
