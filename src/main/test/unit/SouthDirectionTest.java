package unit;

import static org.hamcrest.core.Is.is;
import mars.CoordinatePosition;
import mars.SouthDirection;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;


public class SouthDirectionTest {
    @Test
    public void testGetDirection() {
        SouthDirection southDirection = new SouthDirection();
        assertThat(southDirection.getLeftDirection(), is('E'));
        assertThat(southDirection.getRightDirection(), is('W'));
    }

    @Test
    public void testGetName() {
        SouthDirection southDirection = new SouthDirection();
        assertThat(southDirection.getName(), is('S'));
    }

    @Test
    public void testForwardPosition() {
            SouthDirection southDirection = new SouthDirection();
            assertThat(southDirection.forwardPosition(),is(new CoordinatePosition(0,-1)));
    }
}
