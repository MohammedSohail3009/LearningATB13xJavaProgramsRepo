package Polymorphism;

public class Lab_0072_MethodOverridingAutomation {
    public static void main(String args[]){
        chrome c1 = new chrome();
        c1.openBrowser();
CommonToAll c2 = new chrome(); // Dynamic Dispatch
c2.openBrowser();



firefox f1 = new firefox();
f1.openBrowser();

CommonToAll c3 = new firefox();
c3.openBrowser();

    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser");
    }
}
class chrome extends CommonToAll{
    void openBrowser(){
        System.out.println("Starting Chrome Browser");
    }
}

class firefox extends CommonToAll{
    void openBrowser(){
        System.out.println("Starting Firefox Browser");
    }
}