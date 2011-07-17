package mars;

public class NorthDirection extends Direction{

    @Override
    public char getLeftDirection(){
        return 'W';
    }
    @Override
    public char getRightDirection(){
        return 'E';
    }

    @Override
    public char getName() {
        return 'N';
    }

    @Override
    public CoordinatePosition forwardPosition(){
        return new CoordinatePosition(0,1);
    }

}
