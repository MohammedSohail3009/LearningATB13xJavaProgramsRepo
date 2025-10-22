package Exceptions;

import java.util.Scanner;


public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("you can't go to Goa!");
        }
    }
}