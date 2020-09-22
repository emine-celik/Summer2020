package day54_Abstraction.EmployeeTask;

public class Tester extends Person {

    double salary;


    public Tester(String name, int age, String jobTitle,double salary) {
        super(name, age, jobTitle);
        this.salary= salary;
    }

    public void fixingBug(){
        System.out.println(name+" is fixind bug");
    }




    @Override
    public void meeting() {
        System.out.println(name+" He is attending daily standups");
    }
}
