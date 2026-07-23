
public class App {
    public static void main(String[] args) throws Exception {
            Car carObj = new Car("BMW",200);
        // carObj.accelerate();
            Car anotherCar = carObj;   ///? 
            anotherCar.name = "Audi";
            System.out.println(carObj.name);

            JamesBondCar jbc = new JamesBondCar("Aston Martin",300,true,true);
            System.out.println( jbc.accelerate());

        }
}
