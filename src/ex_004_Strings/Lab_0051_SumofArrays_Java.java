package ex_004_Strings;

public class Lab_0051_SumofArrays_Java {
    public static void main(String[] args){
        int[] numbers = {12,14,16};
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum = sum+numbers[i];

        }
        System.out.println(sum);
    }
}
