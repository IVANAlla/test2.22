package web.controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAOImpl;
import web.modols.Car;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }
    private CarDAOImpl carDAO = new CarDAOImpl();

    public Controller() {}

    public Controller(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String listCars (@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars =carDAO.getCarsAll();
        List<Car> cars1 = carDAO.getCarCount(count);//
        model.addAttribute("cars", cars);
        model.addAttribute("cars", cars1);
        return "cars"; // cars.html
    }

}
