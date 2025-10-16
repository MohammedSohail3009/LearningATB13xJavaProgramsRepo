package ex_111_IIB;

public class Lab_0080_IIB_Java {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();

    }
}
class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("This is IIB");
        System.out.println("If you want to execute or call something after object is created");
    }
  //  static{
   //     System.out.println("Static");
   // }
}