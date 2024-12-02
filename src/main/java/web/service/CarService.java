package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.models.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCarCount(int count) ;
}
