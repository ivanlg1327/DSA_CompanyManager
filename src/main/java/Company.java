
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Company implements Comparator {
    private String companyName;
    private String description;
    private List <Employee> employeeList;

    public Company(String companyName, String description, List<Employee> employeeList) {
        this.companyName = companyName;
        this.description = description;
        this.employeeList = employeeList;
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String toString() {
        return this.companyName;
    }
}
