package week3.fileexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarManagement {

    private List<ICar> cars;
    private final String FILENAME = "car.txt";
    private ICarDataManagement cdm;


    public CarManagement(ICarDataManagement cdm) {
        this.cdm = cdm;
        cars = cdm.getCars();

    }

    public void addCar(ICar car){
        cars.add(car);
        cdm.saveCars(cars);
    }



}
