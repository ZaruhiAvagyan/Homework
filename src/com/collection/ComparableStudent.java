
public class ComparableStudent implements Comparable<ComparableStudent>{

    private String firstName;
    private String lastName;
    private int age;


    public ComparableStudent(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(ComparableStudent o) {
        String compared_lastName = o.getLastName();
        if(this.getLastName().compareTo(compared_lastName) > 0) {
            return 1;
        } else if (this.getLastName().compareTo(compared_lastName) < 0) {
            return -1;
        } else
            return 0;
    }
}

