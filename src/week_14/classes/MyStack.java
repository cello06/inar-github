package week_14.classes;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyStack {
    private Queue<Number> numbers;
    private Queue<Number> tempQueue;

    public MyStack() {
        this.numbers = new LinkedList<>();
        this.tempQueue = new LinkedList<>();
    }

    public void push(Number number) {
        this.numbers.offer(number);
    }

    public Number pop() {
        if(numbers.isEmpty()){
            throw new RuntimeException("List is empty!");
        }
        while (!numbers.isEmpty()) {
            if (numbers.size() != 1) {
                tempQueue.add(numbers.remove());
            } else {
                break;
            }
        }
        Number result = numbers.remove();

        while (!tempQueue.isEmpty()) {
            numbers.add(tempQueue.remove());
        }
        return result;
    }
    public int size(){
        return this.numbers.size();
    }
    public Number top(){
        if(numbers.isEmpty()){
            throw new RuntimeException("List is empty!");
        }
        while (!numbers.isEmpty()) {
            if (numbers.size() != 1) {
                tempQueue.add(numbers.remove());
            } else {
                break;
            }
        }
        Number result = numbers.peek();
        tempQueue.add(numbers.remove());

        while (!tempQueue.isEmpty()) {
            numbers.add(tempQueue.remove());
        }
        System.out.println(numbers);
        return result;
    }
    public boolean isEmpty(){
        return this.numbers.isEmpty();
    }

}
