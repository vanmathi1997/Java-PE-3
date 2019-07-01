import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade obj;
@Before
    public void setUp()
{
    obj=new StudentGrade();
}
    @After
    public void tearDown()
    {
     obj=null;
    }
    @Test
    public void testgivenArrayShouldReturnNotBetween1to100Grades()
    {
        double array[]= {20,77,102,34,57};
        String result=obj.checkgrade(array);
        assertEquals("Not Between 1 to 100",result);
    }

    @Test
    public void testgivenArrayShouldReturnPassed()
    {
        double array[]= {27,73,66,38,52};
        String result=obj.checkgrade(array);
        assertEquals("Passed",result);
    }
    @Test
    public void testgivenArrayShouldEvaluateDouble()
    {
        double array[]= {27.5,73.4,66.3,38.4,52.3};
        String result=obj.checkgrade(array);
        assertEquals("Passed",result);
    }

}