import java.util.Date;
public class Employee implements Comparable {
    String name;
    String surname;
    Date birthday;
    double salary;
    // String companyName;

    public Employee(String name, String surname, Date birthday, double salary) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        // this.companyName = companyName;
    }
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
