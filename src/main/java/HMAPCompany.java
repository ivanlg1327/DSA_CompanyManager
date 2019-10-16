import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class HMAPCompany { //implements CompanyManager



    HashMap<String, Company> companies = new HashMap<String, Company>();

    public Logger log = LogManager.getLogger(HMAPCompany.class);
    public HMAPCompany() {
        this.companies = new HashMap<String, Company>();;
    }


    //private HashMap<String, Company> compa = new HashMap<String, Company>();


    public void putCompany(String id, Company comp){
        log.info("nova companyia: "+comp);

        companies.put(id,comp);
    }
    public Company getCompany(String id) {
        Company company = companies.get(id);
        log.info("retornem: "+ company);
        int i=1;
        if (i==1) {
          log.warn(" xxx" );
            log.error(" yyyy" );
            log.fatal(" zzzzz" );
        }

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
