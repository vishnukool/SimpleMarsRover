package unit;

import mars.CoordinatePosition;
import mars.NorthDirection;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NorthDirectionTest {
       @Test
    public void testGetDirection() {
        NorthDirection northDirection = new NorthDirection();
        assertThat(northDirection.getRightDirection(), is('E'));
        assertThat(northDirection.getLeftDirection(), is('W'));
    }

    @Test
    public void testGetName() {
        NorthDirection northDirection = new NorthDirection();
        assertThat(northDirection.getName(), is('N'));
    }

    @Test
    public void testForwardPosition() {
            NorthDirection northDirection = new NorthDirection();
            assertThat(northDirection.forwardPosition(),is(new CoordinatePosition(0,1)));
    }
}
