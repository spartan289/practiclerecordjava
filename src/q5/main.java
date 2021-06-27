package q5;

import java.util.*;
public class main {
    public static void main(String[] args){
        int r;
        Stack stack = new Stack(10);

        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            try {
                stack.push(n);
                System.out.println("Elements in Stack = " + (stack.getTos() +1));
            } catch (StackException e) {
                System.err.println(e.getMessage());

            }
        System.out.println("Popping integers from stack...");

        try {
            System.out.println("Popped " + stack.pop() + "...");
        } catch (StackException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Popping integers from stack...");


    }
}


