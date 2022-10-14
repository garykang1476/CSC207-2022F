package week3;

import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> items = new ArrayList<>();

    public void add(T o){
        items.add(o);
    }

    public T pop(){
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public static void main(String[] args) {
        String s1 = "this is the item";
        MyStack<String> stack = new MyStack<>();
        stack.add(s1);



        String item = stack.pop();
    }
}
