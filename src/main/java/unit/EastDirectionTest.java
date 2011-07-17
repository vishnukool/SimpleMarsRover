package test.unit;

import mars.CoordinatePosition;
import mars.EastDirection;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EastDirectionTest {
        @Test
    public void testGetDirection() {
        EastDirection eastDirection = new EastDirection();
        assertThat(eastDirection.getRightDirection(), is('S'));
        assertThat(eastDirection.getLeftDirection(), is('N'));
    }

    @Test
    public void testGetName() {
        EastDirection eastDirection = new EastDirection();
        assertThat(eastDirection.getName(), is('E'));
    }

    @Test
    public void testForwardPosition() {
            EastDirection eastDirection = new EastDirection();
            assertThat(eastDirection.forwardPosition(),is(new CoordinatePosition(1,0)));
    }
}
