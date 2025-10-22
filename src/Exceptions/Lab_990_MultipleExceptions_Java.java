package Exceptions;

public class Lab_990_MultipleExceptions_Java {
    public static void main(String[] args){
        System.out.println(1);
        int a = 0;
        try {
            a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Are you Fool");
        } catch (Exception e) {
        System.out.println("Are you Fool too");
    }
        System.out.println(2);
    }
}
