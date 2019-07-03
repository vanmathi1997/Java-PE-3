import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionHandlingTest {
    ExceptionHandling obj1,obj2;
    @Before
    public void setup() {
        obj1= new ExceptionHandling();
        obj2= new ExceptionHandling();

    }

    @After
    public void teardown() {
        obj1 = null;
        obj2 = null;

    }

    @Test
    public void testThrowExceptionForHello() {
        String result=obj1.throwexception("hello");//test case for hello
        assertEquals("helloreached finally",result);

    }
    @Test
    public void testThrowExceptionForWorld() {
        String result=obj2.throwexception("");//test case for empty string
        assertEquals("reached finally",result);

    }


    }