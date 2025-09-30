

package ex_004_Strings;
import java.util.Scanner;

public class Lab50_Userinput_Arrays {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array(int) only");
        int size = sc.nextInt();
        int[] number_marks = new int[size];
        for(int i =0;i<number_marks.length;i++) {
            System.out.println("Enter the numbers");
            number_marks[i] = sc.nextInt();
        }
            System.out.println("---------------Printing above code");
            for(int i = 0;i<number_marks.length;i++){
                System.out.println(number_marks[i]);
            }
        }
        }
