public class SavingAccount extends Account{

    public SavingAccount(double balance){

        super(balance);

    }

    @Override
    public void calculateInterest(){

        System.out.println("Savings Interest = "
                +(balance*0.04));

    }

}