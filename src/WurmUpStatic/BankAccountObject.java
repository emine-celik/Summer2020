package WurmUpStatic;

public class BankAccountObject {
    public static void main(String[] args) {


        Bank bank1=new Bank("Checking","Emine Celik","1236788",25.000);

        System.out.println(bank1);


        bank1.withDraw(500);
        bank1.checkBalance();
        bank1.deposit(1000);
        bank1.checkBalance();







    }
}
