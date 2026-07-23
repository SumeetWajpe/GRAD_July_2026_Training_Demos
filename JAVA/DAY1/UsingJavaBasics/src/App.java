import java.util.Scanner;

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

        // double principle = 1000000;
        // double rate = 7.5;
        // int years = 2;

        // double interest = (principle* rate * years) / 100;
        // double maturity = principle + interest;
        // System.out.println("Interest -> " + interest );


        // Depict some transactions;

        // double balance = 1000000;
        // balance += 5000;
        // balance -=10000;
        // balance*=1.02;


        // creditScore 750;


        // Only if passwordCorrect & otpVerified then print "Authenticated"
        // boolean passwordCorrect = true;

        // boolean otpVerified = true;

        // boolean login = passwordCorrect && otpVerified;

        // System.out.println("Authenticated ? " + login);

        // balance 1200; -> Minimum balance Maintained or "Penalty applicable"
// Scanner scanner = new Scanner(System.in);


//         double balance  = scanner.nextDouble();
//         String status = balance >= 1000 ? "Minimum balance maintained" :"Penalty Applicable";
//         System.out.println(status);

        // Accept the transaction amount & option from user 
        // make use of switch. -> Deposit,Withdraw,Balance Enquiry,Invalid Option
        // balance =100000

        // Arrays

        double[] deposits = {
            12000,5000,3000,15000,9000
        };

        double total = 0;
        // for(int i =0;i<deposits.length;i++){
        //     total+= deposits[i];
        // }
        for(double amount : deposits){
            total+=amount;
        }
        System.out.println("Total Balance : " + total);

    }
}
