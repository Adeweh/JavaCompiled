package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    public Turtle ijapa;
    private SketchPad sc;



    @BeforeEach
    void setUp() {
        ijapa = new Turtle();
        sc = new SketchPad(5, 5);
    }

    @Test
    public void turtleCanBeCreatedTest() {
        assertNotNull(ijapa);
    }

    @Test
    public void penIsUpByDefaultTest() {

        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertTrue(ijapa.isPenUp());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMoveBackUp() {
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());

        ijapa.PenUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void whenFacingEast_turtleCanTurnRightTest() {
        assertSame(EAST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

    }

    @Test
    public void whenFacingSouth_turtleCanTurnWest() {
        assertSame(EAST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

    }

    @Test
    void testThatTurtleCanTurnRight() {
        assertSame(EAST, ijapa.getCurrentDirection());

        ijapa.turnRight();

        assertSame(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }

    @Test
    void testThatTurtleCanTurnLeft() {
        assertSame(EAST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanMoveForwardFacingEastTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.move(5, sc);
        ijapa.move(5, sc);

        Position expectedPosition = new Position(0, 8);
        //boolean result = expectedPosition.equals(new Position(0,5));
        // System.out.println(result);

        assertEquals(expectedPosition, ijapa.getCurrentPosition());
    }

    @Test
    public void whenPenIsDOwn_TurtleCanWriteWhileMoving() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.penDown();
        int currentColumn = ijapa.getCurrentPosition().getColumn();
        int currentRow = ijapa.getCurrentPosition().getRow();

        ijapa.move(5, sc);

        //boolean result = expectedPosition.equals(new Position(0,5));
        // System.out.println(result);

        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

        //System.out.println(Arrays.deepToString(sc.getFloor()));

        int [][] floor = sc.getFloor();
        for (int i = currentColumn; i < currentColumn + 1; i++) {
            assertEquals(1, floor[currentRow][i]);
        }

        for (int i = 0; i < floor.length ; i++) {
            System.out.println();
            for (int j = 0; j < floor.length; j++) {
                System.out.print(floor[i][j] + " ");

            }

        }


    }
    @Test
    public void whenPenIsDown_TurtleCanWriteMovingSouth() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

        ijapa.penDown();
        int currentColumn = ijapa.getCurrentPosition().getColumn();
        int currentRow = ijapa.getCurrentPosition().getRow();

        ijapa.move(5, sc);

        //boolean result = expectedPosition.equals(new Position(0,5));
        // System.out.println(result);

        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());

        //System.out.println(Arrays.deepToString(sc.getFloor()));

        int [][] floor = sc.getFloor();
        for (int i = currentRow; i < currentRow + 1; i++) {
            assertEquals(1, floor[1][currentColumn]);
        }

        for (int i = 0; i < floor.length ; i++) {
            System.out.println();
            for (int j = 0; j < floor.length; j++) {
                System.out.print(floor[i][j] + " ");

            }

        }


    }
    @Test
    public void whenPenIsDown_TurtleCanWriteMovingWest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.move(5,sc);

        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());

        ijapa.penDown();
        int currentColumn = ijapa.getCurrentPosition().getColumn();
        int currentRow = ijapa.getCurrentPosition().getRow();

        ijapa.move(5, sc);


        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());


        int [][] floor = sc.getFloor();
        for (int i = currentColumn; i > currentColumn - 1; i--) {
            assertEquals(1, floor[currentRow][i]);
        }

        for (int i = 0; i < floor.length ; i++) {
            System.out.println();
            for (int j = 0; j < floor.length; j++) {
                System.out.print(floor[i][j] + " ");

            }

        }


    }
    @Test
    public void whenPenIsDown_TurtleCanWriteMovingNorth() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.move(5,sc);

        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());

        ijapa.penDown();
        int currentColumn = ijapa.getCurrentPosition().getColumn();
        int currentRow = ijapa.getCurrentPosition().getRow();

        ijapa.move(5, sc);


        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());


        int [][] floor = sc.getFloor();
        for (int i = currentRow; i > currentRow - 1; i--) {
            assertEquals(1, floor[i][currentColumn]);
        }

        for (int i = 0; i < floor.length ; i++) {
            System.out.println();
            for (int j = 0; j < floor.length; j++) {
                System.out.print(floor[i][j] + " ");

            }

        }


    }
}
