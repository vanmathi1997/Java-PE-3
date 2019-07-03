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
    public void testShouldReturnWordsWithoutVowels()//test case for hello
    {

        String result=obj.remove("hello");
        assertEquals("hll",result);

    }
    @Test(expected = NullPointerException.class)//test case for null
    public void testgivenNullShouldReturnNull()
    {

        String result=obj.remove(null);


    }
    @Test
    public void testgivenStringWithoutVowelShouldReturnSameString()//test case for words without vowel
    {
        String result=obj.remove("srcbnm");
        assertEquals("srcbnm",result);

    }


}