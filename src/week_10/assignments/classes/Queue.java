package week_10.assignments.classes;

import java.util.Arrays;

public class Queue {
    private int[] elements;
    private int size;
    public Queue(){
        elements = new int[8];
    }
    public void enqueue(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    public int dequeue(){
        int result = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return result;
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i]+" ";
        }
        return result;
    }
}
