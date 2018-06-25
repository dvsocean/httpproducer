package cars;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRestController {

  private final CarService carService;

  public CarRestController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/car/{id}")
  public Car locateCar(@PathVariable("id") Long carId){
    return carService.carById(carId);
  }
}
