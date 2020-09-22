package day42_Static;

public class Tester {
   /* String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;


    public void setInfo( String name,char gender,long employeeID,String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public void smokeTesting(){
        System.out.println(name+" smoke tasting");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Employee ID: "+employeeID+", Job Title"+jobTitle+", Salary: "+salary;
    }
    */
   String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, char gender,long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
    }



}
