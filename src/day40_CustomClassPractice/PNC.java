package day40_CustomClassPractice;

public class PNC {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String accountType, String  accountHolder,String accountNumber){
       this.accountType=accountType;
       this.accountHolder=accountHolder;
       this.accountNumber=accountNumber;
    }

    public void getAccountInfo(){

        System.out.println("======================================");

        System.out.println("Account Holder "+accountHolder);
        System.out.println("Account Number "+accountNumber);

        System.out.println("Available balance "+balance);

        System.out.println("=======================================");

    }

    public void checkBalance(){
        System.out.println("Available balance "+balance);
    }
    public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance +=amount;
    }

    public  void withDraw(double amount){
        if(amount > balance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrowing "+amount+" from "+accountNumber);
        balance -= amount;
    }






}
