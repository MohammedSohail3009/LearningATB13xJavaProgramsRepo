package Static_Keyword;

public class Lab_0098_Static_Keyword_Java {
    public static void main(String[] args){
        P p1 = new P();
        P p2 = new P();
        System.out.println(P.a);
        System.out.println(p1.a);

        p1.a = 12;
        System.out.println(P.a);
        System.out.println(p1.a);

    }
}
class P{
    static int a = 9;
}