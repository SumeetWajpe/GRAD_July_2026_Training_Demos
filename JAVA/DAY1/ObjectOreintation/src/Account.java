public abstract class Account {

    protected double balance;

    public Account(double balance){
        this.balance=balance;
    }

   public abstract void calculateInterest();

}

// Create Custom Exception -> InsufficientBalanceException

// withdraw method (amount)

// if withdrwal amount > balance. -> throw an InsufficientBalanceException exception