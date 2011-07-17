package mars;

import java.util.Hashtable;

public class Rover {


    private Direction direction;
    private CoordinatePosition coordinatePosition;
    private CoordinatePosition plateau;
    private static Hashtable<Character, Direction> directionList = new Hashtable<Character, Direction>();
    private GridBoundary gridBoundary = new GridBoundary();

    static {
        directionList.put('N', new NorthDirection());
        directionList.put('S', new SouthDirection());
        directionList.put('W', new WestDirection());
        directionList.put('E', new EastDirection());
    }

    public Rover(CoordinatePosition startPosition, char direction, CoordinatePosition plateau) {
        initStates(direction);
        coordinatePosition = startPosition;
        this.plateau=plateau;
    }

    private void initStates(char direction) {
        this.direction = directionList.get(direction);
    }

    public void rotateRight() {
        initStates(direction.getRightDirection());
    }

    public void rotateLeft() {
        initStates(direction.getLeftDirection());
    }

     public void move() {
         if (gridBoundary.isInsideBoundary(plateau,coordinatePosition,direction))
        coordinatePosition.setLocation(newXOrdinate(),newYOrdinate());  
         else {
             throw new OutOfPlateauBoundsException();
         }
    }

    private int newYOrdinate() {
        return coordinatePosition.getYOrdinate()+direction.forwardPosition().getYOrdinate();
    }

    private int newXOrdinate() {
        return coordinatePosition.getXOrdinate()+direction.forwardPosition().getXOrdinate();
    }

    public void executeCommands(String command) {
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'L') {
                rotateLeft();
            } else if (command.charAt(i) == 'R') {
                rotateRight();
            } else if (command.charAt(i) == 'M') {
                move();
            }
        }
    }

    public String toString() {
        return coordinatePosition.getXOrdinate() + " " + coordinatePosition.getYOrdinate() + " " + direction.getName();
    }

    public Direction getDirection() {
        return direction;
    }

    public CoordinatePosition getCoordinatePosition() {
        return coordinatePosition;
    }


}
