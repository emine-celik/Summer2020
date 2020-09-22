package day47_Encapsulations;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dob;

    public Person(String name, int age, char gender, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }

    private int ID;
    private long ssn;
    private String address;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person:" + " name= " + name  + ", age= " + age + ", gender= " + gender + ", dob= " + dob ;
    }
}
