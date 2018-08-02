package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
//        calls the super class constructor
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}


























//----------------Ignore the code below for the above exercise on interface and abstract classes---------

//package shapes;
//
//public class Rectangle {
//
//    protected double length;
//    protected double width;
//
//    public Rectangle() {
//
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return length * width;
//
//    }
//
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//
//    }
//
//
//}
