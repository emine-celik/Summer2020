package day54_Abstraction.EmployeeTask;

public  abstract class Person {

    String name;
    int age;
    String jobTitle;

    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public abstract void meeting();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
