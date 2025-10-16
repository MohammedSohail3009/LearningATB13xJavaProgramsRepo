package Super;

public class Lab_0078_Super_Java {
    public static void main(String[] args){
        Animal cat = new Animal();
        cat.sound();
    }
}

class God{
void sound(){
    System.out.println("God");
}
God(){
    System.out.println("God DC");
}

}
class Animal extends God {

    void sound(){
     super.sound();
    }
    Animal(){
        super();
    }
}