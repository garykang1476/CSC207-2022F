package week6.observer;

import java.util.Observable;
import java.util.Observer;

public class Company implements Observer {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("Company's item " + o + " " + arg);

    }
}
