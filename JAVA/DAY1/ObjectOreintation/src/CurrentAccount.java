public class CurrentAccount extends Account{

    public CurrentAccount(double balance){

        super(balance);

    }

    @Override
    public void calculateInterest(){

        System.out.println("Current Account Interest = 0");

    }

}