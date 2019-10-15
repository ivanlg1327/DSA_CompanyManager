import java.util.*;

import org.apache.log4j.Logger;


public class HMAPCompany {



    HashMap<String, Company> companies = new HashMap<String, Company>();

    public Logger log;
    public HMAPCompany(HashMap<String, Company> companies) {
        this.companies = companies;
    }


    //private HashMap<String, Company> compa = new HashMap<String, Company>();


    private void putCompany(String id, Company comp){
        log.info("nova companyia: "+comp);

        companies.put(id,comp);
    }
    private Company getCompany(String id) {
        Company company = companies.get(id);
        log.info("retornem: "+ company);
        int i=0;
        if (i==1) {
          log.warn(" xxx" );
         }

        return company;
    }

    private Company deleteCompany(String Id){
        return companies.remove(Id);
    }

    private int companyCount(){
        return companies.size();
    }

    // CRUD
}
