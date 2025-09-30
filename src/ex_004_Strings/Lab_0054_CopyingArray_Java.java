package ex_004_Strings;
import java.util.Arrays;

public class Lab_0054_CopyingArray_Java {
    public static void main(String[] args){
        int [] original = {44,54,88};
        int [] copy = new int[original.length];
        System.arraycopy(original,0,copy,0,original.length);
        System.out.println("original : " + Arrays.toString(original));
        System.out.println("copy : " + Arrays.toString(copy));
    }
}
