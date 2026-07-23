public class Car{
    public String name;
    public int speed;

    Car(String name,int speed){
            this.name = name;
            this.speed = speed;
    }

    public String accelerate(){
        return ("The car " + name + " is running at " + speed + " kmph !");
    }

} 