import java.lang.classfile.ClassFile.Option;
import java.util.*;
public class App {

       
    public static void main(String[] args) throws Exception {
        //     Car carObj = new Car("BMW",200);
        // // carObj.accelerate();
        //     Car anotherCar = carObj;   ///? 
        //     anotherCar.name = "Audi";
        //     System.out.println(carObj.name);

        //     JamesBondCar jbc = new JamesBondCar("Aston Martin",300,true,true);
        //     System.out.println( jbc.accelerate());



        MyCollection<Account> accts = new MyCollection<Account>();
        
            

        Account accounts[] = {
            new SavingAccount(100000),
            new CurrentAccount(200000),
            new FDAccount(300000),
            
        };

        for(Account account:accounts){
            account.calculateInterest();
        }

            String[] sentence = new String[10];
            // String word =  sentence[5].toLowerCase();

            Optional<String> checkNull = Optional.ofNullable(sentence[5]);

            if(checkNull.isPresent()){
              String word =  sentence[5].toLowerCase();
              System.out.println(word);
            }
            else
                System.out.println("Word is Null !");

     


        }

      
}
