public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car is started...");
    }

    @Override
    public void stopEngine() {
       System.out.println("Car is stopped...");
    }
}
