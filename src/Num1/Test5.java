package Num1;

import java.util.Stack;

/*
    @author Pavel Sergeev
 */
public class Test5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(2);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }
    }
}
