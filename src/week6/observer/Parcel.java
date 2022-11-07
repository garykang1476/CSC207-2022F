package week6.observer;

import java.util.Observable;
import java.util.Observer;

public class Parcel extends Observable {

    private String trackingNumber;
    private String location;

    public Parcel(String trackingNumber, String location) {
        this.trackingNumber = trackingNumber;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


    public void updateLocation(String loc){
        location = loc;
        //setChanged();
        notifyObservers("The item as been shipped");
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Parcel p = new Parcel("1001", "Toronto");

        Customer c = new Customer("Gary");
        Company a = new Company("Amazon");

        p.addObserver(c);
        p.addObserver(a);

        p.updateLocation("Beijing");
    }
}
