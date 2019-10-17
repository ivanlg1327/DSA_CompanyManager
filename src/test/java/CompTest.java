import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import java.util.List;

public class CompTest {
    HMAPCompany prueba = null;
    @Before
    public void setUp() {
        List<Employee> list=new ArrayList<Employee>() ;
        List<Employee> list2=new ArrayList<Employee>() ;
        //List<Employee> list3=new ArrayList<Employee>() ;
        Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Employee juan = new Employee("Juan", "rst", date, 3);
        Employee paco = new Employee("Paco", "reyt", date, 1);
        Employee pepe = new Employee("Pepe", "fjh", date, 31);
        list.add(juan);
        list.add(paco);
        list.add(pepe);
        Company quiebra= new Company("Quiebra","Hace quebrar otras empresas",list);
        Company starkIndustries= new Company("Stark Industries","Advanced technology",list2);

        prueba=new HMAPCompany();
        //prueba.addEmployee("Juan", rst, date, 3);

        prueba.putCompany("1A", quiebra);
        prueba.putCompany("1B", starkIndustries);
        prueba.addEmployee("James","Bond",date,2,"1A");
        prueba.addEmployee("Anthony","Stark",date,20000000,"1B");
        prueba.addEmployee("Pepper","Pots",date,10000000,"1B");
        prueba.findAllCompanies();

        prueba.employees("1B");
        List<Employee> list3=new ArrayList<Employee>() ;
        list3=prueba.employees("1A");
        prueba.getCompany("fallo");

    }


    @Test
    public void testEmpleados() {

        Company c = prueba.getCompany("1A");
        Assert.assertEquals("testEmpleados", "Quiebra", c.getCompanyName());

    }

}
