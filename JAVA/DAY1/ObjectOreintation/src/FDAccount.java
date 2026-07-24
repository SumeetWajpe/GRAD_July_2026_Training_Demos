public class FDAccount extends Account{

    public FDAccount(double balance){

        super(balance);

    }

    @Override
    public void calculateInterest(){

        System.out.println("FD Interest = "
                +(balance*0.075));

    }

}