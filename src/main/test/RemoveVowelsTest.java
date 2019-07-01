import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels obj;
    @Before
    public void setUp()
    {
        obj=new RemoveVowels();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void testShouldReturnWordsWithoutVowels()
    {

        String result=obj.remove("hello");
        assertEquals("hll",result);

    }
    @Test(expected = NullPointerException.class)
    public void testgivenNullShouldReturnNull()
    {

        String result=obj.remove(null);


    }
    @Test
    public void testgivenStringWithoutVowelShouldReturnSameString()
    {
        String result=obj.remove("srcbnm");
        assertEquals("srcbnm",result);

    }


}