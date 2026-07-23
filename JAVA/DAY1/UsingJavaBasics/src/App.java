public class App {
    public static void main(String[] args) throws Exception {
        //     byte branchId = 12;

        // short employeeId = 2500;

        // int accountNumber = 125487;

        // long transactionId = 987654321456L;

        // float interestRate = 6.5f;

        // double accountBalance = 2456789.45;

        // char accountCategory = 'P';

        // boolean kycCompleted = true;

        // Type casting
        // int amount = 5000;
        // double total = amount;
        // double interest = 2345.88;
        // int rounded = (int) interest;
        

        // Show Maturity Amount to user for a FD

        double principle = 1000000;
        double rate = 7.5;
        int years = 2;

        double interest = (principle* rate * years) / 100;
        double maturity = principle + interest;
        System.out.println("Interest -> " + interest );
    }
}
