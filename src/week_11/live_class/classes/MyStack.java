package week_11.live_class.classes;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return this.list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public void push(Object value) {
        this.list.add(value);
    }

    public Object pop() {
        Object value = this.list.get(getSize() - 1);
        this.list.remove(getSize() - 1);
        return value;
    }

    @Override
    public String toString() {
        return "stack : " + list.toString();
    }
}
