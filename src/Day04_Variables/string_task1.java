package Day04_Variables;

public class string_task1 {
/*task:
    declare the following variables:

     employeeName =
     employeeID =  if the eployye id hase character use (String) because (int)you can not use other than number
     jobTitle =
     salary = its decimal #
     gender = (char) because is single character
     isFullTime =    (boolean)   because is true/false


 */
 public static void main(String[] args) {
                                     //"Employee Name: + Emine
     String employeeName = "Emine"; //if you change the (name) of the employeeName its not going to change
     int employeeID = 12345;
     //String employeeID = B123; because is TEXT use STRING
     String jobTitle = "SDET";
     double salary = 120_000.5;
     char gender = 'F';
     boolean isFulltime = true;

     System.out.println("Employee Name is"+ employeeName);
     System.out.println("Employee ID is" + employeeID);
     System.out.println("Job Title is:" + jobTitle);
     System.out.println("Salary is:" + salary + " USA");
     System.out.println("Gender:" + gender);
     System.out.println("Full Time is:" + isFulltime);
 }
}
