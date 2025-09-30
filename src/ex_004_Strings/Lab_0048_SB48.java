package ex_004_Strings;

public class Lab_0048_SB48 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16);
        System.out.println(sb);
        sb.replace(0,4,"c++");
        System.out.println(sb);

    }
}
