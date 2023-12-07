package week_14;


import week_14.classes.MyStack;

import java.util.LinkedList;
import java.util.Queue;

public class Question_14_08 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        try {
            System.out.println("Top method :" + stack.top());

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Size :" + stack.size());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
