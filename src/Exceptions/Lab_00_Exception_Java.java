package Exceptions;

public class Lab_00_Exception_Java {
    public static void main(String[] args) {


        int a = 0;
        try {
            a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}