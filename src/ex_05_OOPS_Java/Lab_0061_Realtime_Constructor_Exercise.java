package ex_05_OOPS_Java;

public class Lab_0061_Realtime_Constructor_Exercise {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);



    }
}

class Car{
    String name;
    int year;
    String model;

    Car(){
        name = "Unknown Car";
        year = 1991;
        model = "YYYY";
    }
}