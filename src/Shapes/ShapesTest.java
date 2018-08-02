package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(9,2);
        System.out.println("area: " + box1.getArea());
        System.out.println("perimeter: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("Box 2's area is equal to: " + box2.getArea());
        System.out.println("Box 2's perimeter is: " + box2.getPerimeter());

        Square box3 = new Square(3);
        System.out.println("Box 3's area is: " + box3.getArea());




    }
}
