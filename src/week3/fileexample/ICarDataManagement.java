package week3.fileexample;

import java.util.List;

public interface ICarDataManagement {

    List<ICar> getCars();

    void saveCars(List<ICar> cars);
}
