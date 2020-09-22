package day54_Abstraction.ShapeTask;

public class Triangle extends Shape{
   double base;
   double height;

   public Triangle(double base,double height){
       this.base=base;
       this.height=height;
   }


    @Override
    public void area() {
        System.out.println("Triangle are is: "+(base*height) /2);
    }
}
