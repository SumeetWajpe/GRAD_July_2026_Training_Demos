public class App {
    public static void main(String[] args)  {
        System.out.println("Started");
       try{
         int n = 100;
        int x = n/10;
        System.out.println(x);
        String[] cars = {"BMW","AUDI","MERC"};
        cars[5] = "Ferrari";
       }
       catch(ArithmeticException ex){
        System.out.println(ex.getMessage());
       }
       catch(ArrayIndexOutOfBoundsException ex){
        System.out.println(ex.getMessage());
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
        System.out.println("Ended");
    }
}
