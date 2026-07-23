public class JamesBondCar extends Car {
    public boolean isArmed;
    public boolean canFly;
    JamesBondCar(String name,int speed,boolean isArmed,boolean canFly){
        super(name, speed);
        this.canFly = canFly;
        this.isArmed = isArmed;
    }
}
