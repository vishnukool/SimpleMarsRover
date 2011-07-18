package unit;

import mars.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RoverTest {

    @Test
    public void testToString() throws Exception {
        CoordinatePosition coordinatePosition = mock(CoordinatePosition.class);
        CoordinatePosition plateau = mock(CoordinatePosition.class);
        when(coordinatePosition.getXOrdinate()).thenReturn(2);
        when(coordinatePosition.getYOrdinate()).thenReturn(3);

        Rover rover=new Rover(coordinatePosition,'N',plateau);
        assertThat(rover.toString(),is("2 3 N"));
    }

}
