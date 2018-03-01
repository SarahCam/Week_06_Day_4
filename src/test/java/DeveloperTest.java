import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mike", "NB1234567A", 40000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Mike", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("NB1234567A", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(41000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double bonus = developer.payBonus();
        assertEquals(400.00, bonus, 0.01);
    }

    @Test
    public void canRaiseSalary___WONT_ACCEPT_NEGATIVE_RAISE(){
        developer.raiseSalary(-1000.00);
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canSetName(){
        developer.setName("Ernest");
        assertEquals("Ernest", developer.getName());
    }

//    @Test
//    public void canSetName___WONT_ACCEPT_NULL_VALUE(){
//        developer.setName();
//        assertEquals("Mike", developer.getName());
//    }

}
