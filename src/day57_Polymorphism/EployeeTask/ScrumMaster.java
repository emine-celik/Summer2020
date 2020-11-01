package day57_Polymorphism.EployeeTask;

public class ScrumMaster extends Employee{
    @Override
    public void work() {

    }

    public ScrumMaster(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);


    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
