import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    private static ConsecutiveNumbers obj;
    @Before
    public void setup() {
        obj= new ConsecutiveNumbers();
   }

    @After
    public void teardown() {
         obj = null;

    }
    @Test
    public void testgivenNonConsNumbersShouldReturn() {
        String result=obj.checkconsecutive("98,96,95,94,93");
        assertEquals("Non consecutive numbers",result);
    }
    @Test
    public void consectest2() {
        String result=obj.checkconsecutive("54,53,52,51,50,49,48");
        assertEquals("consecutive numbers",result);
    }
    @Test(expected = NumberFormatException.class)
    public void consectest3() {
        String result=obj.checkconsecutive("a,b,c,d,e,f");
    }

}