import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayTest {
    FirstAndLastDay obj;
    @Before
    public void setUp()
    {
        obj=new FirstAndLastDay();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void testShouldReturnFirstAndLastDay()
    {

        String result=obj.calculateFirstandLAstday();
        assertEquals("Mon 01/07/2019Sun 07/07/2019",result);

    }

}