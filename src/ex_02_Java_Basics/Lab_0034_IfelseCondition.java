package ex_02_Java_Basics;
import java.util.Scanner;

public class Lab_0034_IfelseCondition {
    public static void main(String[] args){
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age>=18) {
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }

    }
}
