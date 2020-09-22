package day54_Abstraction.EmployeeTask;

public class BankOfAmerica {
    public static void main(String[] args) {
         Tester tester1= new Tester("Emine ",33,"Sdet",120000);
         tester1.fixingBug();
        System.out.println(tester1);
    }
}
