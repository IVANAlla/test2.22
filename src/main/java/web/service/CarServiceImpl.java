package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.modols.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl {
    private int count = 0;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mercedes", "White", 777));
        cars.add(new Car("RangeRover", "Black", 333));
        cars.add(new Car("BMW", "Grey", 139));
        cars.add(new Car("Lada", "Red", 999));
        cars.add(new Car("Ford", "White", 347));
    }

    public List<Car> getCarCount(int count) {
        if (count < 5) {
            return  cars.subList(0, count);
        }
        return cars;
    }
}
