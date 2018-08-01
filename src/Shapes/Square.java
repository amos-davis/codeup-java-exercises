package Shapes;
import Shapes.Rectangle;

public class Square extends Rectangle {

    protected double side;

//    public Square(double side) {
//        super(side, side);
//    }

    public Square(double side) {
        this.length = side;
        this.width = side;
        this.side = side;
    }
@Override
    public double getArea() {
        return side * side;
    }

@Override
    public double getPerimeter() {
        return 4 * side;
    }
}
