package MultipleInheritence;

public class Lab_0065_RealTime_MultiLevel_Inheritence {
    public static void main(String[] args){
        GrandFather gf = new GrandFather();

        gf.gf();

        Father f1 = new Father();
        f1.gf();
        f1.f();

        System.out.println(f1.gold_gf);

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.home();
        System.out.println(s1.gold_gf);

    }
}
