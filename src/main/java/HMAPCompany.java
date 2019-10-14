import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

public class HMAPCompany {
// lo del log y el logger lo ha puesto el profe aun tengo que ver como funciona y ponerlo bien
    HashMap<String, Company> companies = new HashMap<String, Company>();
    private final List<LoggingEvent> log = new ArrayList<LoggingEvent>();
    public HMAPCompany(HashMap<String, Company> compa) {
        companies = compa;
    }
    private void putCompany(String id, Company comp){
     //   log.info("nova companyia: "+comp);
        companies.put(id,comp);
    }
    private Company getCompany(String id) {
        Company company = companies.get(id);
        //log.info("retornem: "+ company);
        // if () {
        // log.error // log.warn(" xxx" );
        // }

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
