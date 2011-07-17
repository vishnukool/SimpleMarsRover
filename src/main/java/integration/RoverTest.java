package integration;

import mars.CoordinatePosition;
import mars.OutOfPlateauBoundsException;
import mars.Rover;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {
    @Test
    public void testRotateRight() {
        CoordinatePosition startPoint = new CoordinatePosition(2,3);
        CoordinatePosition plateau = new CoordinatePosition(5,5);
        Rover rover = new Rover(startPoint,'N',plateau);
        rover.rotateRight();
        assertThat(rover.getDirection().getName(),is('E'));

    }

    @Test
    public void testRotateLeft() {
        CoordinatePosition startPoint = new CoordinatePosition(2,3);
        CoordinatePosition plateau = new CoordinatePosition(5,5);
        Rover rover = new Rover(startPoint,'N',plateau);
        rover.rotateLeft();
        assertThat(rover.getDirection().getName(),is('W'));
    }

    @Test
    public void testMove(){
        CoordinatePosition startPoint = new CoordinatePosition(2,3);
               CoordinatePosition plateau = new CoordinatePosition(5,5);
               Rover rover = new Rover(startPoint,'N',plateau);
               rover.move();
               assertThat(rover.getCoordinatePosition(),is(new CoordinatePosition(2,4)));
    }

    @Test
    public void testExecuteCommands() {
        CoordinatePosition startPoint = new CoordinatePosition(2,3);
               CoordinatePosition plateau = new CoordinatePosition(5,5);
               Rover rover = new Rover(startPoint,'N',plateau);
               rover.executeCommands("LMR");
               assertThat(rover.getDirection().getName(),is('N'));
               assertThat(rover.getCoordinatePosition(),is(new CoordinatePosition(1,3)));

    }

    @Test(expected = OutOfPlateauBoundsException.class)
    public void testMoveThrowsException(){
        CoordinatePosition startPoint = new CoordinatePosition(2,5);
        CoordinatePosition plateau = new CoordinatePosition(5,5);
        Rover rover = new Rover(startPoint,'N',plateau);
        rover.move();



    }


}
