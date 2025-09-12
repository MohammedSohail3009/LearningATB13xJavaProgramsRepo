package ex_02_Java_Basics;

public class Lab_0038_OddNumber_ContinueStatement {
    public static void main(String[] args){
        for(int i=0;i<=50;i++){
            if(i%2==0){
                continue;

            }
            System.out.println("odd -> "+ i);
        }
    }
}
