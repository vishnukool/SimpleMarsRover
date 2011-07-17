package mars;

public class GridBoundary {

    public boolean isInsideBoundary(CoordinatePosition plateau, CoordinatePosition coordinatePosition, Direction direction){

        int newXOrdinate=coordinatePosition.getXOrdinate()+direction.forwardPosition().getXOrdinate();
        int newYOrdinate=coordinatePosition.getYOrdinate()+(int)direction.forwardPosition().getYOrdinate();
        return newXOrdinate>=0 && newXOrdinate <=plateau.getXOrdinate() && newYOrdinate>=0 && newYOrdinate <=plateau.getYOrdinate();

    }

}
