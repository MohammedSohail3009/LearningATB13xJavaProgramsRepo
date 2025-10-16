package Abstraction;

public class Lab_0087_ex_abstract_abstraction_java {
    public static void main(String[] args){
        Car c11 = new Car();
        Child c1 = new Child();
        Father f1 = new Child(); //dynamic dispatch
        c1.loan50k();

    }
}

class Car{
    void done(){

    }

}
abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 25k instantly");
    }
}
class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Given 50k after sometime");
    }
}