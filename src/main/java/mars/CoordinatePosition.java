package mars;

import java.awt.*;

public class CoordinatePosition extends Point{

    public CoordinatePosition(int x, int y) {
        super(x,y);
    }

    public CoordinatePosition(CoordinatePosition coordinatePosition){
        super(coordinatePosition);
    }

    public CoordinatePosition(){
       super();
    }

    public int getXOrdinate(){
    return this.x;
}

     public int getYOrdinate(){
    return this.y;
}

}
