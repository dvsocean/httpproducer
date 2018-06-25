package cars;

public class Car {

  private Long id;
  private String make;
  private String model;

  public Long getId() {
    return id;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Car(Long id, String make, String model) {
    this.id = id;
    this.make = make;
    this.model = model;

  }

}
