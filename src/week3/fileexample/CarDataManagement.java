package week3.fileexample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarDataManagement implements ICarDataManagement {

    private String filename;

    public CarDataManagement(String filename) {
        this.filename = filename;
    }

    @Override
    public List<ICar> getCars() {

        List<ICar> cars = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            ICar car;
            while((line = reader.readLine()) != null){
                String[] data = line.split(",");
                car = new Car(data[0], Integer.valueOf(data[1]));
                cars.add(car);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }

    @Override
    public void saveCars(List<ICar> cars) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (ICar car: cars){
                writer.write(car.toSavableFormat() + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
