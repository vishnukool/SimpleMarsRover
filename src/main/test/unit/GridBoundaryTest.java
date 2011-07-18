package unit;

import mars.CoordinatePosition;
import mars.Direction;
import mars.GridBoundary;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GridBoundaryTest {
    @Test
    public void testIsInsideBoundary() {
        CoordinatePosition plateau = mock(CoordinatePosition.class);
        CoordinatePosition coordinatePosition = mock(CoordinatePosition.class);
        Direction direction = mock(Direction.class);
        GridBoundary gridBoundary = new GridBoundary();

        when(plateau.getXOrdinate()).thenReturn(5);
        when(plateau.getYOrdinate()).thenReturn(5);
        when(direction.forwardPosition()).thenReturn(new CoordinatePosition(1,0));
        when(coordinatePosition.getXOrdinate()).thenReturn(5);
        when(coordinatePosition.getYOrdinate()).thenReturn(3);

        assertThat(gridBoundary.isInsideBoundary(plateau, coordinatePosition, direction),is(false));

    }
}
