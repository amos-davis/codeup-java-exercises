package Shapes;
import Shapes.Rectangle;

public class Square extends Rectangle {

//    protected double side;

    public Square(double side) {
        super(side, side);
    }

//    --longer alternative way for performing the above---
//    public Square(double side) {
//        this.length = side;
//        this.width = side;
//        this.side = side;
//    }
@Override
    public double getArea() {
    System.out.println("Square version");
    return length * length;
    }

@Override
    public double getPerimeter() {
    System.out.println("Square version");
    return length + length + length + length;
//        ---or---
//        return 4 * length;
    }
}
