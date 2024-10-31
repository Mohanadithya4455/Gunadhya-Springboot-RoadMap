public class BankC extends Bank{
    int balance;
    @Override
    void getBalance() {
        System.out.println("Your balance is: "+balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
