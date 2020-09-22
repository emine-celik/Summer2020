package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Mariska=new BankAccount();
        BankAccount Zehra=new BankAccount();
        BankAccount Muhammed = new BankAccount();
        BankAccount Yusuf= new BankAccount();


        Mariska.setAccountInfo("Saving","Mariska Celik","1234566");
        Zehra.setAccountInfo("Saving","Zehra Efe","12354667");
        Muhammed.setAccountInfo("Saving","Muhammed efe","12456788");
        Yusuf.setAccountInfo("Saving","Yusuf Efe","2356788");

        ArrayList<BankAccount> accounts= new ArrayList<>();
        accounts.addAll(Arrays.asList(Mariska,Zehra,Muhammed,Yusuf));

        for(BankAccount each: accounts){
            each.deposit(500);
            each.getAccountInfo();
        }
         accounts.get(1).deposit(10000);
         accounts.get(1).withDraw(9000);
         accounts.get(1).checkBalance();


         accounts.get(2).deposit(500);
         accounts.get(2).checkBalance();
        System.out.println("===============================================");

        accounts.removeIf(p->  p.balance < (1000.0));

        /*for( BankAccount p :accounts){
            p.getAccountInfo();
        }
*/

    }
}
