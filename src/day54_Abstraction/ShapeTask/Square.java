package day54_Abstraction.ShapeTask;

public class Square extends Shape {

    int side;

    public Square(int side){
        this.side=side;
    }

    @Override
    public void area() {
        System.out.println("Square area is: "+side * side);
    }
}
