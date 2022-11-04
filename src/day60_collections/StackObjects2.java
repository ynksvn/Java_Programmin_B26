package day60_collections;

import java.util.Stack;

public class StackObjects2 {
    public static void main(String[] args) {

        Stack<Integer>stack = new Stack<>();
        stack.push(40);
        stack.push(20);
        stack.push(100);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());

//list method doesnt support lifo
    }


}
