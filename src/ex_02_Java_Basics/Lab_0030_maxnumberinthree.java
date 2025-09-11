package ex_02_Java_Basics;

public class Lab_0030_maxnumberinthree {
    public static void main(String args[]){
        int n1 = 32;
        int n2 = 44;
        int n3 = 11;

        /* Step 1
        i/o input = n1,n2,n3 = int
        output = mx number = string
         */
        /* Step 2
        Rough logic or brute
        n1>n2 and n1>n3 : n1;
        n2>n1 and n2>n3 : n2;
        n3;
         */
        int max = (n1>n2) ? (n1>n3) ? n1 : n3 :(n2>n3) ? n2:n3;
        System.out.println(max);

    }
}
