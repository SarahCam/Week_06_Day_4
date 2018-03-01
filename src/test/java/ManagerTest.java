import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Hamish", "NW1234567B", 55000.00, "Asset Management");
    }

    @Test
    public void canGetName(){
        assertEquals("Hamish", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("NW1234567B", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(55000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Asset Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(56000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double bonus = manager.payBonus();
        assertEquals(550.00, bonus, 0.01);
    }
}
