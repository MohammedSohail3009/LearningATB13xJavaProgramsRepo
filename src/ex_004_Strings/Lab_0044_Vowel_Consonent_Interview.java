package ex_004_Strings;

public class Lab_0044_Vowel_Consonent_Interview {
    public static void main(String[] args){
    int vowel=0;
    int consonent = 0;
    String input = "Java Program to count vowels & consonent";
    input = input.toLowerCase();
        System.out.println(input);
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowel++;
            } else{
                    consonent++;
                }
            }
            System.out.println("Number of vowels : " +vowel);
            System.out.println("Number of consonent : " +consonent);
        }

    }
