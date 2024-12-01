package web.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Contrjller {
    @RequestMapping("/")
    public String contrjller() {
        return "index";
    }
}
