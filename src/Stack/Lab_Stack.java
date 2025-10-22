package Stack;

import java.util.Stack;

public class Lab_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("Python");
        s1.add("C#");
        s1.add("Java");
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);

        Stack <Integer> intstack = new Stack();
        intstack.push(10);
        intstack.push(15);
        intstack.push(17);
        System.out.println(intstack);
    }
}
