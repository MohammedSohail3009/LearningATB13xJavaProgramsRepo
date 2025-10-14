package Encapsulation;

public class Lab_Real_Bank {
    public static void main(String[] args){
        SCBANK sufi = new SCBANK("Sufi",100);
        long bal = sufi.getBal();
        System.out.println(bal);
        sufi.setBal(500,true);
        long bal2 = sufi.getBal();
        System.out.println(bal2);



    }
}
class SCBANK {
    String name;
    long bal;

    public SCBANK(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean iscashier) {
       if(iscashier){
            this.bal = bal;
        } else {
            System.out.println("Can't check the balance");
        }
    }
}