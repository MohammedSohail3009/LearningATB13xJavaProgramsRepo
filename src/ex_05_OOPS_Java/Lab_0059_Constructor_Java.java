package ex_05_OOPS_Java;

public class Lab_0059_Constructor_Java {

    public static void main(String[] args) {
        student s1 = new student();
        student s2;
        new student();
    }
}

        class student {
            String name;
            // Default Constructor
            student(){
                System.out.println("Sufi");
            }
        }


