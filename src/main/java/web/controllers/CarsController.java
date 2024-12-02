package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService ;

    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String listCars (@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model ) {
       CarService carService = new CarServiceImpl();
        List<Car> cars1 = carService.getCarCount(count);//
        model.addAttribute("cars", cars1);
        return "cars";
    }

}
