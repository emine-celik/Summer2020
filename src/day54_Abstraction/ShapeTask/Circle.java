package day54_Abstraction.ShapeTask;

public class Circle extends Shape{

    double r;
    final double pi = 3.14;

    public Circle(double r){
        this.r =r;
    }

    @Override
    public void area() {
        System.out.println("Circle area is: "+ r * r * pi);
    }
}
