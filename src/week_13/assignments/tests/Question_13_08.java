package week_13.assignments.tests;

import week_13.assignments.classes.MyStack;

public class Question_13_08 {
    public static void main(String[] args) {
        try {
            MyStack firstStack = new MyStack();
            firstStack.push(4);
            firstStack.push(5);
            firstStack.push(6);
            System.out.println("Pushing the number 4, 5 and 6 to first stack..");
            System.out.println("Cloning 1st stack ...");
            MyStack secondStack = (MyStack)(firstStack.clone());
            System.out.println("Popping object from 1st stack..");
            firstStack.pop();
            System.out.println("1st Stack: " + firstStack.toString());
            System.out.println("2nd stack: " + secondStack.toString());
            System.out.println("Is the 1st stack equal to the 2nd stack ? --> " +
                    (firstStack == secondStack));
        }catch (CloneNotSupportedException e){

        }
    }
}
