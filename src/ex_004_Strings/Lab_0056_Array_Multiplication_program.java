package ex_004_Strings;
import java.util.Scanner;
public class Lab_0056_Array_Multiplication_program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size_of_table = sc.nextInt();
        for(int i = 0; i< size_of_table; i++){
            for(int j = 0; j< size_of_table; j++){
                System.out.print(i*j+ " | ");
            }
            System.out.println();
        }
    }
}
