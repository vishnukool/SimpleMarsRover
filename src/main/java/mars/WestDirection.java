package mars;

public class WestDirection extends Direction{

    @Override
    public char getLeftDirection(){
        return 'S';
    }
    @Override
    public char getRightDirection(){
        return 'N';
    }

    @Override
    public char getName() {
        return 'W';
    }

    @Override
    public CoordinatePosition forwardPosition(){
        return new CoordinatePosition(-1,0);
    }
}
