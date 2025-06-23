package ex_02_Java_Basics;

public class Lab_014_String_InterviewP2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
