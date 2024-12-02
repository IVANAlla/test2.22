package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import web.modols.Car;

import java.util.List;

@Controller
public class CarsController {

    private CarServiceImpl carService = new CarServiceImpl();

    public CarsController() {}

    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String listCars (@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model ) {
        List<Car> cars1 = carService.getCarCount(count);//
        model.addAttribute("cars", cars1);
        return "cars";
    }

}
