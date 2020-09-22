package day40_CustomClassPractice;

public class BOfA {
    public static void main(String[] args) {

        BankAccount Emine= new BankAccount();

        Emine.setAccountInfo("Saving","Emine Celik","1233456");

        Emine.getAccountInfo();
        Emine.deposit(1000);
        Emine.checkBalance();

        Emine.withDraw(500);
        Emine.checkBalance();

        Emine.withDraw(100000);
        Emine.checkBalance();









    }
}
