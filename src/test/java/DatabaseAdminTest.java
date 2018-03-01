import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Mary", "NB1234567G", 45000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Mary", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("NB1234567G", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(46000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double bonus = databaseAdmin.payBonus();
        assertEquals(450.00, bonus, 0.01);
    }

}
