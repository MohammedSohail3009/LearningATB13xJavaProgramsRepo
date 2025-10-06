package ex_05_OOPS_Java;
public class Lab_0062_RealtimeParamaterised_Constructor {
    public static void main(String[] args) {
        Person P1 = new Person("Sufi",988484798,"XYZ");
        System.out.println("Name : " + P1.name);
        System.out.println("Phone : " + P1.phone);
        System.out.println("Address : " + P1.address);



    }
}

class Person{
    String name;
    long phone;
    String address;

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.phone = phone_user;
        this.address = address_user;
    }
}