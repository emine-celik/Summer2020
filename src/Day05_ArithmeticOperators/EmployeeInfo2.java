package Day05_ArithmeticOperators;

public class EmployeeInfo2 {
    public static void main(String[] args) {



    String firstName = "John";
    String lastName = "Smith";
    char gender  = 'M';
    int age = 39;
    String companyName = "PayPal";
    String jobTitle = "SDET";
    boolean isFullTime = true;
    boolean isMarried = false;
    double salary = 125_000.50;
    String fullName = firstName+" "+lastName; // "Aaron Jones"


     System.out.println("Employee' full name is:" + fullName);
        System.out.println(fullName+"' gender is:" +gender);
        System.out.println(fullName+"' age is:"+ age + " years old");
        System.out.println(fullName + " works at: "+companyName);
        System.out.println(fullName+"' Job title is: "+jobTitle);
        System.out.println(fullName+"' salary is: $"+salary);
        System.out.println(fullName+" is full time employee: "+ isFullTime);
        System.out.println(fullName+" is married: "+ isMarried);


}






}
