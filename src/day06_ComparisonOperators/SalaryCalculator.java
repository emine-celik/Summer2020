package day06_ComparisonOperators;

public class SalaryCalculator {

    public static void main(String[] args) {
     double rate = 55; // one year hase 48 weeks
     double stateTaxRate = 0.08;
     double federalTaxeRate = 0.22;
     int weeklyHours = 48;

        double salary = rate * weeklyHours * 48;
        double Totaltax = salary * (stateTaxRate + federalTaxeRate);
        double salaryAfterTax = salary - Totaltax;

        System.out.println("Salary before tax: " +salary+ " USD");
        System.out.println("Total tax: " +Totaltax+ " USD");
        System.out.println("Take home salary: " +Totaltax);


    }




}
