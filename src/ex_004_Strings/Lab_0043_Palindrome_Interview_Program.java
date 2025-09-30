package ex_004_Strings;
import java.util.Scanner;
public class Lab_0043_Palindrome_Interview_Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.next();
        String new_reversed = reversedString(input);
        if(new_reversed.equalsIgnoreCase(input)){
            System.out.println("Entered String is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    static String reversedString(String input){
        String reversed = "";
        for(int i = input.length()-1;i>=0;i--){
            reversed = reversed+input.charAt(i);
        }
        return reversed;
    }
}
