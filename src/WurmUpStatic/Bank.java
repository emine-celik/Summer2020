package WurmUpStatic;

public class Bank {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public Bank( String accountType,String accountHolder, String accountNumber,double balance){
        this.accountType=accountType;
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }


    public void checkBalance(){
        System.out.println("Avalaible Balance: "+balance);
    }

    public void deposit(double amount){
        System.out.println("Deposit  $ "+amount+" to "+accountNumber);
        balance+=amount;
    }

    public void withDraw(double amount){
       if(amount > balance){
           System.out.println("Not enough balance");
           return;
       }

       System.out.println("Withdrowing "+amount+" from "+accountNumber);
       balance -= amount;
    }


    public String toString(){
        return "Account Type: "+accountType+"\nAccount Holder "+accountHolder+"\nAccount Number "+accountNumber;
    }



}
