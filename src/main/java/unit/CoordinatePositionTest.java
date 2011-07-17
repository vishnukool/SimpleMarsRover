package unit;

import mars.CoordinatePosition;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CoordinatePositionTest {
    @Test
    public void testGetXOrdinate() {
        CoordinatePosition coordinatePosition= new CoordinatePosition(3,4);
        assertThat(coordinatePosition.getXOrdinate(),is(3));
    }

    @Test
    public void testGetYOrdinate() throws Exception {
        CoordinatePosition coordinatePosition= new CoordinatePosition(3,4);
        assertThat(coordinatePosition.getYOrdinate(),is(4));

    }
}
