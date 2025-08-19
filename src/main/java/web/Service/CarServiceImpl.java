package web.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import web.Model.Car;

@Service
public class CarServiceImpl implements CarServies{

    private final List<Car> cars = new ArrayList<>(List.of(
            new Car("Tesla Model S", 0, 2020),
            new Car("BMW M5", 4.6, 2021),
            new Car("Audi RS6", 5.5, 2019),
            new Car("Ford Mustang", 4.5, 2018),
            new Car("Chevrolet Camaro", 1.6, 2022),
            new Car("Dodge", 4.0, 2022),
            new Car("Tesla HiberTrak", 0, 2022),
            new Car("Tank M1Abrams", 9.0, 2025),
            new Car("Reno Logan", 1.6, 2022),
            new Car("Mazda 6", 1.6, 2021),
            new Car("Volga", 1.6, 1992)));

    @Override
    public List<Car> getCarList(Integer count) {
        count = (count > 5) ? 5 : (count < 0) ? 0 : count;
        return cars.stream().limit(count).toList();
    }
}