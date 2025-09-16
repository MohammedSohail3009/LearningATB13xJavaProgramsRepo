package ex_03_Functions_Basics;
import java.util.Scanner;


public class Lab_003_Arithmetic_Functions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Enter int only");
            return;
        }
        System.out.println("Enter number 2");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Enter int only");
        }
// calling a function
        int result_sum = sum(a, b);
        System.out.println("Sum  " + result_sum);
        int result_sub = sub(a, b);
        System.out.println("Sub " + result_sub);
        int result_div = div(a, b);
        System.out.println("Div " + result_div);

    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a,int b) {
        return a - b;
    }
    static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("b can't be zero");
        }

    return a/b;
    }

}