package mars;

public class EastDirection extends Direction{

    @Override
    public char getLeftDirection(){
        return 'N';
    }
    @Override
    public char getRightDirection(){
        return 'S';
    }

    @Override
    public char getName() {
        return 'E';
    }

    @Override
    public CoordinatePosition forwardPosition(){
        return new CoordinatePosition(1,0);
    }

}
