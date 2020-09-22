package day48_Inheritance;

public class BankAccount {


    public String firstName;
    public String lastName;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static String bankName;
    static {
        bankName="Bank of America";
    }
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

     public void deposit(double amount){
         System.out.println("Depositing: "+amount);
        balance+=amount;
     }
    public void withdraw(double amount){

        if(amount <= 0 || amount > 100){
            System.out.println("Invalid balance");
            return;
        }
        if(amount > balance){
            System.out.println("Not enough balance");
            return;
        }
            System.out.println("Withdraw: "+amount);
            balance -= amount;
    }

    public void availableBalance( ){
        System.out.println("Available balance: "+getBalance());
    }

/*
    public String toString(){
        return "First Name: "+firstName+",Last Name: "+lastName;
    }
    */


    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
