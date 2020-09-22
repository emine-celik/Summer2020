package day54_Abstraction.ShapeTask;

public class Geometric_Object {
    public static void main(String[] args) {

        Circle circle= new Circle(2);
        circle.area();

        Triangle triangle = new Triangle(4,5);
        triangle.area();

        Rectangle rectangle = new Rectangle(3,5);
        rectangle.area();

        Square square = new Square(4);
        square.area();

    }
}
