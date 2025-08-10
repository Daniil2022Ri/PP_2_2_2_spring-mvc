package web.Model;

public class Car {
    private String nameCars;
    private double sizeEngine;
    private int year;

    public Car(){}

    public Car(String model , double sizeEngine , int year){
        this.nameCars = model;
        this.sizeEngine = sizeEngine;
        this.year = year;
    }

    public String getNameCars() {
        return nameCars;
    }

    public void setNameCars(String nameCars) {
        this.nameCars = nameCars;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(double sizeEngine) {
        this.sizeEngine = sizeEngine;
    }
}
