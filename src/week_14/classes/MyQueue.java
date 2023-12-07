package week_14.classes;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> numbers;

    private Stack<Integer> temp;

    public MyQueue() {
        this.numbers = new Stack<>();
        this.temp = new Stack<>();
    }

    public void push(int number) {
        this.numbers.push(number);
    }

    public int pop() {
        if (this.numbers.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        while (!this.numbers.isEmpty()) {
            if (this.numbers.size() != 1) {
                this.temp.push(this.numbers.pop());
            } else {
                break;
            }
        }
        int result = this.numbers.pop();

        while (!this.temp.isEmpty()) {
            this.numbers.push(this.temp.pop());
        }
        return result;
    }

    public int peek() {
        if (this.numbers.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        while (!this.numbers.isEmpty()) {
            if (this.numbers.size() != 1) {
                this.temp.push(this.numbers.pop());
            } else {
                break;
            }
        }
        int result = this.numbers.peek();

        while (!this.temp.isEmpty()) {
            this.numbers.push(this.temp.pop());
        }
        return result;
    }

    public boolean isEmpty() {
        return this.numbers.isEmpty();
    }

    public int size() {
        return this.numbers.size();
    }
}
