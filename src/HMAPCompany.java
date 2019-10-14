import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HMAPCompany {

    HashMap<String, Company> Companies = new HashMap<>();
    public HMAPCompany(HashMap<String, Company> companies) {
        Companies = companies;
    }
    private void putCompany(String Id, Company comp){
        Companies.put(Id,comp);
    }
    private Company getCompany(String Id){
        return Companies.get(Id);
    }

    private Company deleteCompany(String Id){
        return Companies.remove(Id);
    }

    private int companyCount(){
        return Companies.size();
    }

    // CRUD
}
