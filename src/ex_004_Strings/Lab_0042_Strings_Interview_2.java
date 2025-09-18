package ex_004_Strings;

public class Lab_0042_Strings_Interview_2 {
    public static void main(String args[]){


    String s1 = "Hello";
    String s4 = "Hello";

    String s3 = new String("hello");
    String s2 = new String("Hell0");
    String s5 = new String("Hello");

        System.out.println(s1==s3); // == compare reference location
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5)); // equals check contents
        System.out.println(s4.equals(s3));
        System.out.println(s4.equalsIgnoreCase(s3));

}
}