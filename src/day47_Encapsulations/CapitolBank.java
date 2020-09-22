package day47_Encapsulations;

import javax.print.attribute.standard.PagesPerMinute;

public class CapitolBank {

    public String employeeName;
    public int age;
    public String jobTitle;

    public CapitolBank(String employeeName, int age, String jobTitle) {
        this.employeeName = employeeName;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public static String companyName;
     static {
        companyName = "Capitol One";
     }

        private int iD;
        private double salary;
        private String address;


        public void setiD ( int iD ){
            this.iD = iD;
        }
        public void setSalary ( double salary ){
            this.salary = salary;
        }
        public void setAddress ( String address ){
            this.address = address;

        }
        public int getiD(){
            return iD;
        }
       public double getSalary(){
            return salary;
       }
        public String getAddress(){
            return address;
        }

        public String toString(){
            return "Name: "+employeeName+", Age: "+age+", Job Title: "+jobTitle +", ID:"+iD+getiD()+", Salary: "+getSalary()+", Address: "+getAddress();
        }

    }


