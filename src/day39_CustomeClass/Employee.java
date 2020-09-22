package day39_CustomeClass;

import java.sql.SQLOutput;

public class Employee {
    /*

    String name;
    char gender;
    long SSN;
    String jobTitle;
    double salary;
    public void setEmployeeInfo(String employeeName, char employeeGender, long employeeSSN, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }


    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary);
        String ssn = ""+SSN;
        System.out.println("Last four digits of SSN: "+  ssn.substring(ssn.length()-4)    );
    } */


    String name;
    char gender;
    String SSN;
    int employeeID;
    String jobTitle;
    double salary;
    String companyName;

    public void setEmloyeeInfo(String EmployeeName,char Gender,String eployeeSSN,int EmployeeID,String JobTitle,double Salary,String CompanyName){ name=EmployeeName;
     gender=Gender;
     employeeID=EmployeeID;
     jobTitle=JobTitle;
     salary=Salary;
     companyName=CompanyName;
    }

    public void getEmployeeInfo(){

        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary);
        String ssn=""+SSN;
        System.out.println("Last four digit of SSN: "+ssn.substring(ssn.length()-4));
    }
}
