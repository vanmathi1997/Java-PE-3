import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition obj;
    @Before
    public void setUp()
    {
        obj=new MatrixAddition();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayShouldReturnArrayIndexOutOfBoundException()
    {
        int a[][]= {{2,4},{3,5},{1,7}};
        int b[][]= {{9,2},{1,4},{5,3}};
        int[][] result=obj.addmatrix(2,3,a,b);
        int[][] expresult={{11,6},{4,9},{6,10}};}
@Test
   public void testNegativeValuesShouldReturnResult(){

    int a[][]= {{2,-2},{-6,5}};
    int b[][]= {{-5,2},{1,4}};
    int[][] result=obj.addmatrix(2, 2, a, b);
    int[][] expresult= {{-3,0},{-5,9}};
    assertEquals(expresult,result);
}
    @Test
    public void testArrayShouldReturnResult()
    {

        int a[][]= {{2,4},{3,5},{1,7}};
        int b[][]= {{9,2},{1,4},{5,3}};
        int[][] result=obj.addmatrix(3, 2, a, b);
        int[][] expresult={{11,6},{4,9},{6,10}};
        assertEquals(expresult,result);
    }

}