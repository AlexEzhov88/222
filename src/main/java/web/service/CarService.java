package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    private static int CAR_COUNT;

    {
        cars.add(new Car(++CAR_COUNT, "Sasha", "Auto1"));
        cars.add(new Car(++CAR_COUNT, "Anton", "Auto2"));
        cars.add(new Car(++CAR_COUNT, "Marat", "Auto3"));
        cars.add(new Car(++CAR_COUNT, "Oleg", "Auto4"));
        cars.add(new Car(++CAR_COUNT, "Peter", "Auto5"));
    }

    public List<Car> show(Integer id) {
        if(id == null) return cars;
        return cars.stream().limit(id).collect(Collectors.toList());
    }
}
