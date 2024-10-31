
public class Main {
    public static void main(String[] args) {
          BankA a=new BankA();
          BankB b=new BankB();
          BankC c=new BankC();
          a.setBalance(100);;
          b.setBalance(150);
          c.setBalance(200);
          a.getBalance();
          b.getBalance();
          c.getBalance();
    }
}