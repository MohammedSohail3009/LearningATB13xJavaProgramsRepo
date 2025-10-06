package Hierarchial_Inheritence;

public class Lab_0067_Hierarchial_Inheritence {
    public static void main(String[] args){
        Father f1 = new Father();
        Sufi s1 = new Sufi();
        s1.home();

        Azzu a1 = new Azzu();
        a1.home();


    }
}
class Father {
    void home() {
        System.out.println("F-3BHK");
    }
}
    class Sufi extends Father {
        void s1() {
            System.out.println("Sufi");
        }
    }
        class Azzu extends Father{
            void A1(){
                System.out.println("Azzu");
            }
        }
