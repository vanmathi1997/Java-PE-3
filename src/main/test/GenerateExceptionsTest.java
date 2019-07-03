import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {
    GenerateExceptions obj;
    @Before
    public void setup() {
        obj= new GenerateExceptions();
        }

    @After
    public void teardown() {
        obj= null;
    }

    @Test//Test case for NegativeArraySizeException
    public void testNegativeArraySizeException() {
        obj.displayException1();
    }
    @Test//Test case for IndexOutOfBoundException
    public void testIndexOutOfBoundException() {
        obj.displayException2();
    }
    @Test//Test case for NullPointerException
    public void testNullPointerException() {
        obj.displayException3();
    }

}