package ex_02_Java_Basics;
import java.util.Scanner;
public class Lab_0040_Vowel_2_Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the single character");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch =='a' || ch=='e' || ch=='i'||ch=='o'|| ch=='u'){
            System.out.println(ch + " is a vowel");
        }else if (ch>='a' && ch<='z'){
            System.out.println(ch + " is a consonent");
        }else {
            System.out.println("Invalid character");
        }
    }


}
