import java.util.*;
import java.util.HashMap;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class HMAPCompany implements CompanyManager { //implements CompanyManager



    HashMap<String, Company> companies = new HashMap<String, Company>();
    List<Employee> employeeList ;

    private Logger log = LogManager.getLogger(HMAPCompany.class);
    private List<Company> companyList=new ArrayList<Company>(); ;
    HMAPCompany() {
        this.companies = new HashMap<String, Company>();
        this.employeeList = new ArrayList<Employee>();
    }





    public void putCompany(String id, Company comp){
        log.info("nova companyia: "+comp);
        companies.put(id,comp);
    }

    @Override
    public void addEmployee(String name, String surname, Date birthday, double salary, String id) {
        Employee employee= new Employee(name,surname,birthday,salary);
        Company aux =getCompany(id);
        aux.addEmplo(employee);
        this.employeeList.add(employee);

    }

    @Override
    public List<Employee> findAllEmployeesOrderedByName() {
        Collections.sort(this.employeeList);

        return this.employeeList;
    }

    @Override
    public List<Employee> findAllEmployeesOrderedBySalary() {
        Collections.sort(this.employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return ((int)(employee.salary-t1.salary));
            }
        });

        return this.employeeList;
    }

    @Override
    public List<Employee> employees(String company) {
        Company compa = companies.get(company);
        log.info(compa.getEmployeeList());
        return compa.getEmployeeList();
    }

    @Override
    public List<Company> findAllCompanies() {

        for (String i : companies.keySet()) {
             companyList.add(companies.get(i));
        }
        log.info(companyList);
        return companyList;
    }

    public Company getCompany(String id) {
        Company company = companies.get(id);

        int i=0;
        if (company==null) {

            log.error("La empresa "+id+" no existe" );
        }
        else
        {
            //log.info("La empresa "+ company);
            /*log.warn(" xxx" );
            log.error(" yyyy" );
            log.fatal(" zzzzz" );*/
        }
        return company;
    }

    public Company deleteCompany(String Id){
        return companies.remove(Id);
    }

    public int companyCount(){
        return companies.size();
    }



}
