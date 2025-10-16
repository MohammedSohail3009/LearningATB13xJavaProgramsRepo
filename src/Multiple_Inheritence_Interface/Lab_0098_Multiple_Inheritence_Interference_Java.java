package Multiple_Inheritence_Interface;

public class Lab_0098_Multiple_Inheritence_Interference_Java {
    public static void main(String[] args){
        child c1 = new child();
        c1.money();

    }
}

interface Father1{
    void money();
}
interface Father2{
    void money();
}
class child implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child own money");
    }
}