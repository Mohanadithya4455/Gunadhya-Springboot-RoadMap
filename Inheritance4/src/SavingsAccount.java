public class SavingsAccount extends BankAccount{

//    public SavingsAccount(int balance) {
//        super(balance);
//    }
//    public SavingsAccount() {
//        super();
//    }

    @Override
    public void withdraw(int amount_withdrawn) {
        if(this.getBalance() <amount_withdrawn){
            System.out.println("Insufficient balance");
        }
        else{
            this.setBalance(this.getBalance()-amount_withdrawn);
            System.out.println("Your Current Balance: "+this.getBalance());
            System.out.println("Successfully withdrawn");
        }
    }

    @Override
    public void deposit(int amount_deposit) {
     this.setBalance(this.getBalance()+amount_deposit);
     System.out.println("Your Current Balance: "+this.getBalance());
     System.out.println(amount_deposit+" is deposited successfully");
    }
}
