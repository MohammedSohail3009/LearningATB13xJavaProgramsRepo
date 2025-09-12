package ex_02_Java_Basics;
import java.util.Scanner;

public class Lab_0039_FactorialProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (non negative): ");
        int n = sc.nextInt();
        if(n<0) {
            System.out.println("Invalid input");
            return;
        }
        long result = 1;
        for(int i =2;i<=n;i++){
            result*=i;
        }
        System.out.println(n + "! = " + result);
    }
}
