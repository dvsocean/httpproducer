package services;

import objects.Car;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CarService {

  private final Map<Long, Car> carMap;

  public CarService() {
    carMap = new HashMap<>();
    carMap.put(1L, new Car(1L, "Ferrai", "Modena"));
    carMap.put(2L, new Car(2L, "Honda", "Civic"));
    carMap.put(3L, new Car(3L, "Toyota", "4Runner"));
    carMap.put(4L, new Car(4L, "Ford", "Raptor"));
    carMap.put(5L, new Car(5L, "Dodge", "Ram"));
  }

  public Car carById(Long id) {
    return carMap.get(id);
  }
}
