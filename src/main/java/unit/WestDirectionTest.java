package test.unit;

import static org.hamcrest.core.Is.is;

import mars.CoordinatePosition;
import mars.WestDirection;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class WestDirectionTest {
    @Test
    public void testGetDirection() {
        WestDirection westDirection = new WestDirection();
        assertThat(westDirection.getRightDirection(), is('N'));
        assertThat(westDirection.getLeftDirection(), is('S'));
    }

    @Test
    public void testGetName() {
        WestDirection westDirection = new WestDirection();
        assertThat(westDirection.getName(), is('W'));
    }

    @Test
    public void testForwardPosition() {
            WestDirection westDirection = new WestDirection();
            assertThat(westDirection.forwardPosition(),is(new CoordinatePosition(-1,0)));
    }
}
