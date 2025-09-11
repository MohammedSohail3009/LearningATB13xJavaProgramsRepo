package ex_02_Java_Basics;

public class Lab_0029_NestedTernary_Java {
    public static void main(String args[]){
        int age = 76;
        String result = (age<18)? "Minor" : (age<65) ? "Adult": "Senior";
        System.out.println(result);
    }
}
