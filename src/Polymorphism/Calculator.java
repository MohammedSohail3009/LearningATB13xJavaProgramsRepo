package Polymorphism;

public class Calculator {
    public static void main(String[] args){
        calc c1 = new calc();
        System.out.println(c1.add(5,4));
        System.out.println(c1.add(4.15,9.42));


    }
}
class calc{
    int attribute;
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}