package ex_004_Strings;

public class Lab_0044_Vowel_Consonent_Interview {
    public static void main(String[] args){
        String input = "Java Program to count Vowels & Consonents";
int vowel = 0;
int consoent = 0;

input = input.toLowerCase();
for(int i=0;i<input.length();i++){
    char ch = input.charAt(i);
    if(ch =='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        vowel++;

    }else{
        consoent++;
    }
}
        System.out.println("Number of vowel :" + vowel);
        System.out.println("Number of consonent :" + consoent);
    }
}
