package ex_004_Strings;

public class Lab_0046_StringBuffer_Java {
    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer("Sufi");
        stringBuffer.append("Maldar");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());
    }
}