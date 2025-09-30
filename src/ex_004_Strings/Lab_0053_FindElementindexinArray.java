package ex_004_Strings;

public class Lab_0053_FindElementindexinArray {
    public static void main(String[] args){
        int [] a = {34,89,78,98,67,52,27,67,95};
        int target = 27;
        for(int i=0; i<a.length;i++) {
            if(target == a[i]){
                System.out.println(i);
            }
        }
    }
}
