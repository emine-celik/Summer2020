package SELF_PRACTICE;

public class Bank {
/*
   BanckAccount:
    Attributes:
        accountName, AccountNumber, Balcance
    Actions:
        setInfo, withdraw, deposist, checkAvailableBalance

 */

         String accountName;
         int accountNumber;
         double balance;



     public void setBankInfo(String name,int number,double totalBalance){
         accountName=name;
         accountNumber=number;
         balance = totalBalance;
     }

     public void getBankInfo(){
        System.out.println(accountName+" "+accountNumber+" "+balance);

     }



}
