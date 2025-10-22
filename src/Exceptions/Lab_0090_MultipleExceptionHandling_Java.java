package Exceptions;

public class Lab_0090_MultipleExceptionHandling_Java {
    public static void main(String[] args) {


        try {
            String s1 = null;
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arithmetic");
        }
        System.out.println("End");
    }
}