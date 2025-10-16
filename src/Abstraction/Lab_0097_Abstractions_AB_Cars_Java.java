package Abstraction;

public class Lab_0097_Abstractions_AB_Cars_Java {
    public static void main(String[] args){
        WagonR car = new WagonR();
        car.drive();

    }
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void checkEngine(){
        System.out.println("Everything is working ");
    }
}
class WagonR extends Engine{
    @Override
    void startEngine(){
        System.out.println("Starting the Engine");
    }
    @Override
    void stopEngine(){
        System.out.println("Stoping the Engine");
    }
    void drive(){
        checkEngine();
        startEngine();
        stopEngine();

    }
}