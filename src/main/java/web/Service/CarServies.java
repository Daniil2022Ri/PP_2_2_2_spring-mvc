package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarServies {
    List<Car> getCarList(Integer count);
}
