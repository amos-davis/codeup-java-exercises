package shapes;
import shapes.Rectangle;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}



























//----------------Ignore the code below for the above exercise on interface and abstract classes---------

//package shapes;
//import shapes.Rectangle;
//
//public class Square extends Rectangle {
//
////    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//    }
//
////    --longer alternative way for performing the above---
////    public Square(double side) {
////        this.length = side;
////        this.width = side;
////        this.side = side;
////    }
//@Override
//    public double getArea() {
//    System.out.println("Square version");
//    return length * length;
//    }
//
//@Override
//    public double getPerimeter() {
//    System.out.println("Square version");
//    return length + length + length + length;
////        ---or---
////        return 4 * length;
//    }
//}
