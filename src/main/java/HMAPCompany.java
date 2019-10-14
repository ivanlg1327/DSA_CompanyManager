import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;

public class HMAPCompany {
// lo del log y el logger lo ha puesto el profe aun tengo que ver como funciona y ponerlo bien
    HashMap<String, Company> companies = new HashMap<String, Company>();
    public HMAPCompany(HashMap<String, Company> compa) {
        companies = compa;
    }
    private void putCompany(String id, Company comp){
//        log.info("nova companyia: "+comp);
        companies.put(id,comp);
    }
    private Company getCompany(String id) {
        Company company = companies.get(id);
        //Logger.info("retornem: "+ company);
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
