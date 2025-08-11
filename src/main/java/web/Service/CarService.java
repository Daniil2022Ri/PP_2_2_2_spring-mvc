package web.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import web.Model.Car;

@Service
public class CarService {

    private List<Car> cars;


    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla Model S", 0, 2020));
        cars.add(new Car("BMW M5", 4.6, 2021));
        cars.add(new Car("Audi RS6", 5.5, 2019));
        cars.add(new Car("Ford Mustang", 4.5, 2018));
        cars.add(new Car("Chevrolet Camaro", 1.6, 2022));
    }

    public List<Car> getCars(int count) {
        count = (count > 5) ? 5 : (count < 0) ? 0 : count;
        return cars.stream().limit(count).toList();
    }
}