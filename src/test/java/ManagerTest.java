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
}
