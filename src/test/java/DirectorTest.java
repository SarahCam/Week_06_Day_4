import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Angus", "NR1234567Q", 70000.00, "Asset Management", 250000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Angus", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("NR1234567Q", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Asset Management", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(75000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double bonus = director.payBonus();
        assertEquals(1400.00, bonus, 0.01);
    }
}
