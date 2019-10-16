import java.util.Date;
import java.util.List;


public interface CompanyManager {

    public void putCompany(String companyName, Company comp);
    public void addEmployee(String name, String surname, Date birthday, double salary, String id);// throws MyException;
    public List<Employee> findAllEmployeesOrderedByName();
    public List<Employee> findAllEmployeesOrderedBySalary();
    public List<Employee> employees(String company);
    public List<Company> findAllCompanies();
    public Company deleteCompany(String Id);
    public int companyCount();
    public Company getCompany(String id);
}

