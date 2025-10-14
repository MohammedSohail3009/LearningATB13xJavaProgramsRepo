package Polymorphism;

public class Lab_0070_WebAutomation {
    public static void main(String[] args){
        Browser b1 = new Browser();
        b1.startBrowser("chrome");

    }
}
class Browser {
    void startBrowser() {
        System.out.println("Start a Default Browser");
    }

    String startBrowser(String browser) {
        System.out.println("Starting a Browser " + browser);
        return browser;
    }
}