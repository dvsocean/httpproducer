package cars;

import java.util.HashMap;
import java.util.Map;

public class CarService {

  private final Map<Long, Car> carMap;

  public CarService() {
    carMap = new HashMap<>();
    carMap.put(1L, new Car(1L, "Ferrai", "Modena"));
    carMap.put(2L, new Car(1L, "Honda", "Civic"));
    carMap.put(3L, new Car(1L, "Toyota", "4Runner"));
    carMap.put(4L, new Car(1L, "Ford", "Raptor"));
    carMap.put(5L, new Car(1L, "Dodge", "Ram"));
  }

  Car carById(Long id) {
    return carMap.get(id);
  }
}
