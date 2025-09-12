package ex_02_Java_Basics;

public class Lab_0038_ForLoop_Withbreak {
    public static void main(String[] args){
        for(int i=0;i<50;i++){
            if(i==5){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
