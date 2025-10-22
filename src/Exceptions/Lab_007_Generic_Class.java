package Exceptions;

public class Lab_007_Generic_Class {
    public static void main(String[] args){

        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass("Sohail");
        System.out.println(g1);

    }
}

class GenericClass <T> {
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
