import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class HMAPCompany implements CompanyManager { //implements CompanyManager



    HashMap<String, Company> companies = new HashMap<String, Company>();

    public Logger log = LogManager.getLogger(HMAPCompany.class);
    public HMAPCompany() {
        this.companies = new HashMap<String, Company>();;
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

    }

    @Override
    public List<Employee> findAllEmployeesOrderedByName() {
        return null;
    }

    @Override
    public List<Employee> findAllEmployeesOrderedBySalary() {
        return null;
    }

    @Override
    public List<Employee> employees(String company) {
        return null;
    }

    @Override
    public List<Company> findAllCompanies() {
        return null;
    }

    public Company getCompany(String id) {
        Company company = companies.get(id);
        log.info("retornem: "+ company);
        int i=0;
        if (i==1) {
          log.warn(" xxx" );
            log.error(" yyyy" );
            log.fatal(" zzzzz" );
        }
       /* else
        {
            log.error("La empresa no existe" );
        }*/

        return company;
    }

    public Company deleteCompany(String Id){
        return companies.remove(Id);
    }

    public int companyCount(){
        return companies.size();
    }

    // CRUD
}
