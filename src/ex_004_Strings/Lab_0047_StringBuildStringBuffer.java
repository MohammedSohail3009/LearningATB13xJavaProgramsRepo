package ex_004_Strings;

public class Lab_0047_StringBuildStringBuffer {
    public static void main(String[] args){
        String s0 = "Sufi";
        String s1 = new String("Sufi");
        StringBuffer stringBuffer = new StringBuffer("Sufi");
        StringBuilder stringBuilder = new StringBuilder("Sufi");
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
