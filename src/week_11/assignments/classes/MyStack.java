package week_11.assignments.classes;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public MyStack() {

    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(Object o) {
        add(o);
    }

    public Object peek() {
        int lastObjectIndex = size() - 1;
        return get(lastObjectIndex);
    }

    public Object pop() {
        int lastObjectIndex = size() - 1;
        Object result = get(lastObjectIndex);
        remove(lastObjectIndex);
        return result;
    }

    @Override
    public String toString() {
        return "Stack : " + super.toString();
    }
}
