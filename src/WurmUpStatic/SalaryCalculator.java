package WurmUpStatic;
/*
 Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)

                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */
public class SalaryCalculator {

  double hourlyRate;
  double weeklyHours;
  double stateTaxRate;
  double  fedralTaxRate;

  public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate,double  fedralTaxRate){
     this.hourlyRate=hourlyRate;
      this.weeklyHours=weeklyHours;
      this.stateTaxRate=stateTaxRate;
      this.fedralTaxRate=fedralTaxRate;
  }


  public double salary(){
     return hourlyRate * weeklyHours * 48;
  }

    public double salaryAftertax(){
      return  (salary() - stateTaxRate) - fedralTaxRate;
}

public double stateTax(){
      return salary()* stateTaxRate;
}


public double federalTax(){
      return salary()*fedralTaxRate;
}


public String toString(){
      return "Hourly Rate: "+hourlyRate+"\nWeekly Hours: "+weeklyHours+"\nState Tax Rate: "+stateTaxRate+"\nFederal Tax Rate: "+fedralTaxRate+"\nSalary: "+salary();
}



}
