
public class Main {
    public static void main(String[] args) {

        BankAccount adithya = new SavingsAccount();
        //adithya.withdraw(1000);
        adithya.setBalance(20000);
        adithya.deposit(10000);
    }
}