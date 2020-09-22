package day49_Inheritance.ScrumTeamTask;

import day49_Inheritance.Employee;

public class Developer extends Employee {


    public Developer(String name,int age,char gender,double salary,int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);
    }


    public void coding(){
        System.out.println(name+" is Coding");
    }
    public void fixBug(){
        System.out.println(name+" is fixing Bug");
    }


}
