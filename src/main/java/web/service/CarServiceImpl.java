package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private int count = 0;

    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {}

    {
        cars.add(new Car("Mercedes", "White", 777));
        cars.add(new Car("RangeRover", "Black", 333));
        cars.add(new Car("BMW", "Grey", 139));
        cars.add(new Car("Lada", "Red", 999));
        cars.add(new Car("Ford", "White", 347));
    }
    @Autowired
    public CarServiceImpl(List<Car> cars) {
        this.cars = cars;
    }
    public List<Car> getCarCount(int count) {
        if (count < 5) {
            return  cars.subList(0, count);
        }
        return cars;
    }
}
