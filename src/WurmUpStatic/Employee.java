package WurmUpStatic;
/*
warmup task:
    1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
 */
public class Employee {

    String name;
    int Id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name,int Id,long ssn,String jobTitle,double salary,char gender){
        this.name=name;
        this.Id=Id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;

    }
    public String toString(){
        return "Name: "+name+" Id number: "+Id+" Job Title: "+jobTitle+" Salary: "+salary+" Gender: "+gender;
    }

}
