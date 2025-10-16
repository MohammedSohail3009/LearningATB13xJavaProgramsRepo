package Multiple_Inheritence_Interface;

public class Lab_0070_Real_World {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.drive();


    }
}
class Car implements Engine,Brake {
void drive(){
   startEngine();
   applybrake();
   stopEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("Starting the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping the Engine");
    }

    @Override
    public void applybrake() {
        System.out.println("Apply brake");
    }
}

interface Brake{
    void applybrake();

}
interface Engine{
    void startEngine();
    void stopEngine();
    default void complete(){
        System.out.println("Default complete function");
    }
}