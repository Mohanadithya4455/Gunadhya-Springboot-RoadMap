
public class Main {
    public static void main(String[] args) {
       BankAccount b = new BankAccount();
       b.setAccount_number("123456789");
       b.setBalance(59000.80);
       System.out.println("Your bank account number: "+b.getAccount_number()+"  Your balance is: "+b.getBalance());
    }
}