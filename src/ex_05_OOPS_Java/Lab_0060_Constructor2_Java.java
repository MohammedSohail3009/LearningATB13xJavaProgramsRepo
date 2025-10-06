package ex_05_OOPS_Java;

public class Lab_0060_Constructor2_Java {
    public static void main(String[] args){
        Cat c1 = new Cat();
        new Cat();
        c1.running();
        new Cat().running();



    }
}
class Cat {
    String name;

    void running() {
        System.out.println("Running");
    }
}