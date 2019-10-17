
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Company {
    private String companyName;
    private String description;



    private List <Employee> employeeList;
    public Logger log = LogManager.getLogger(HMAPCompany.class);

    public Company(String companyName, String description, List<Employee> employeeList) {
        this.companyName = companyName;
        this.description = description;
        this.employeeList = employeeList;
    }
    public void addEmplo( Employee employee ){
        employeeList.add(employee);
        log.info("El nuevo empleado de la empresa "+ this.companyName +" es "+ employee.name);
    }


    public String getCompanyName() {
        return this.companyName;
    }
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public String toString() {
        return this.companyName;
    }
}
