package day57_Polymorphism.EployeeTask;

public class Tester extends Employee {
    public Tester(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working");
    }

}
