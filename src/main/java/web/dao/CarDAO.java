package web.dao;

import web.modols.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getCarsAll() ;
    public List<Car> getCarCount(int count) ;
}
