package ex_02_Java_Basics;
import java.util.Scanner;

public class Lab_0036_Realtimeautomationswitchstatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Start chrome browser");
                System.out.println("   ");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Launch firefox browser");
                break;
            case "edge":
                System.out.println("Execute edge cases");
                break;
            default:
                System.out.println("Not a valid browser");
                break;
        }
    }
}
