public class Car{
    public String name;
    public int speed;

    Car(){
        this.name = "";
        this.speed = 0;
    }
    Car(String name,int speed){
            this.name = name;
            this.speed = speed;
    }

    public void accelerate(){
        System.out.println("The car " + name + " is running at " + speed = "kmph !");
    }

} 