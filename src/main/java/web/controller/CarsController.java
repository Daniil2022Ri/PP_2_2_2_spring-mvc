package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.Service.CarServies;

@Controller

public class CarsController {

    private final CarServies CarServies ;

    @Autowired
    public CarsController(CarServies CarServies) {
        this.CarServies = CarServies;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", CarServies.getCarList(count));
        return "cars";
    }

}
