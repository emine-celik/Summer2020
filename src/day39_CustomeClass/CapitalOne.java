package day39_CustomeClass;

import Day3_sequences_Variables.EmployeeInfo;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
          Employee employee1=new Employee();
          Employee employee2=new Employee();
          Employee employee3=new Employee();
          Employee employee4=new Employee();

          employee1.setEmloyeeInfo("Emine",'F',"13642345",648392,"Sdet",120000,"PayPall");
          employee1.getEmployeeInfo();
          employee2.setEmloyeeInfo("Ayse",'F',"12344567",234578,"QA",120980,"WS");

         employee3.setEmloyeeInfo("Ferda",'F',"12344567",234578,"QA",120980,"WS");
         employee4.setEmloyeeInfo("Muhammed",'F',"12344567",234578,"QA",120980,"WS");

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4) );
        double max = Integer.MIN_VALUE;
        String name = "";
        for( Employee each : employeeList ){
            double eachSalary = each.salary;
            if(eachSalary > max){
                max =  eachSalary;
                name = each.name;
            }
        }
        System.out.println("Maximum Salary: "+max);
        System.out.println("Name: "+name);

        System.out.println("========================================");

        //  employeeList.removeIf( p -> p.salary < 150000 );
        //employeeList.removeIf( each -> each.salary > 135000 );
        //employeeList.removeIf( each -> each.jobTitle.equals("QA") );
        // employeeList.removeIf( each -> each.name.toLowerCase().contains("m") );
        employeeList.removeIf( each -> each.name.charAt(0) == 'R' );

        for( Employee each: employeeList){
            // each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }
    }











    }

