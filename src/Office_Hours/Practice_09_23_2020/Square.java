package Office_Hours.Practice_09_23_2020;

public class Square extends Shape{
    public double side;

    public Square(double side) {
        if(side <= 0){
            throw new RuntimeException("Side of the square");
        }
        this.side = side;
        area =calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
