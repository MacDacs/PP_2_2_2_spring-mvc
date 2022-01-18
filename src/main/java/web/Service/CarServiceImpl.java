package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Blue","AUDI",5));
        cars.add(new Car("Red","BMW",10));
        cars.add(new Car("Yellow","BMW",20));
        cars.add(new Car("Green","BMW",30));
        cars.add(new Car("White","BMW",40));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByIndex(int i) {
        return cars.stream().limit(i).toList();
    }
}
