package week6.observer;

import java.util.Observable;
import java.util.Observer;

public class Customer extends Observable implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Customer got update: \n" + o.toString() + " says " + arg);

    }
}
