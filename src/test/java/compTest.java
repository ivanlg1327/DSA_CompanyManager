import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import java.util.List;

public class compTest {

    @Before
    public void setUp() {
        List<Employee> list=new ArrayList<Employee>() ;
        Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Employee juan = new Employee("Juan", "rst", date, 3);
        Employee paco = new Employee("Paco", "reyt", date, 1);
        Employee pepe = new Employee("Pepe", "fjh", date, 31);
        list.add(juan);
        list.add(paco);
        list.add(pepe);
        Company quiebra= new Company("Quiebra","Hace quebrar otras empresas",list);
       // HMAPCompany prueba=new HMAPCompany(String,Company);
     //   prueba.

    }

}
