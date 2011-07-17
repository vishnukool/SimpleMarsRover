package mars;

public class SouthDirection extends Direction{

    @Override
    public char getLeftDirection(){
        return 'E';
    }
    @Override
    public char getRightDirection(){
        return 'W';
    }

    @Override
    public char getName() {
        return 'S';
    }

    @Override
    public CoordinatePosition forwardPosition(){
        return new CoordinatePosition(0,-1);
    }

}
