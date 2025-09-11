package ex_02_Java_Basics;

public class Lab_0031_UserInputCLI {
    public static void main(String[] args){
        String age_String = args[0];
        int age = Integer.parseInt(age_String);
        System.out.println(age_String);
        String CanIVote = age >= 18 ? "yes": "No";
        System.out.println(CanIVote);
    }
}
