package Office_Hours.Practice_09_23_2020;

public class Cube extends Shape implements Volume {
    public double width , length, height, volume;

    public double side;

    @Override
    public double calculateArea() {
        return Math.pow(side, 2)* 6;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateVolume() {
        return  Math.pow(side,3);
    }
}
