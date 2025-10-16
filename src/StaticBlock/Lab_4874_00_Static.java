package StaticBlock;

public class Lab_4874_00_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);
        System.out.println(ref1.a);
        System.out.println(ref2.a);
        System.out.println(A.b);
        ref1.displayvalue();
        ref2.displayvalue();
        A.staticmethod();


    } }
class A{
    int a;
    static int b = 20;

    A (int a) {
        this.a = a;
    }
    void displayvalue() {
        System.out.println(this.a);
    }
    static void staticmethod(){
        System.out.println("This is called when class is loaded");
    }
}