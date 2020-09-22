package day44_Constructor;

public class Employee1 {
    String name;
    int Id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static { // runs first, only one time
        isEmployed = true;
        hasSalary = true;
    }

    public void setEmployeeInfo(String name, int Id, long ssn, String jobTitle, double salary, char gender) {
        this.name = name;
        this.Id = Id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public String toString() {
        return "Name: " + name + "\nId number: " + Id +"\nSSN: " +ssn+"\nJob Title: " + jobTitle + "\nSalary: " + salary + "\nGender: " + gender;
    }





}