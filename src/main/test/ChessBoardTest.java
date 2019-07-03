import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard obj;

    @Before
    public void setup() {
        obj = new ChessBoard();

    }

    @After
    public void teardown() {
        obj = null;

    }

    @Test
    public void testShouldReturnChessBoardStructureOf2X2() {//test case for 2X2
        String[][] resultboard = {{"WW|", "BB|"}, {"BB|", "WW|"}};
        assertArrayEquals(resultboard, obj.chess(2, 2));


    }

    @Test
    public void testShouldReturnChessBoardStructure() {//Test case for 8X8
        String[][] resultboard = {{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}
        };
        assertArrayEquals(resultboard, obj.chess(8, 8));
    }

    @Test
    public void testShouldReturnNull() {//Test case for 2X3
        assertArrayEquals(null, obj.chess(2, 3));


    }
}