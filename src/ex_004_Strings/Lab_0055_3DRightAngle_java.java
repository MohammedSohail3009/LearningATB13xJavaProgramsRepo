package ex_004_Strings;
import java.util.Scanner;

public class Lab_0055_3DRightAngle_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value e.g n=3");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }