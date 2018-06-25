package hello;

import objects.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import services.CarService;

@ComponentScan("services")
@RestController
public class CarController {

  private final CarService carService;

  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/car/{id}")
  public Car locateCar(@PathVariable("id") Long carId){
    return carService.carById(carId);
  }
}
